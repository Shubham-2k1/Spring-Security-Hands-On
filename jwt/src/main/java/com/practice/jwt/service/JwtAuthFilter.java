package com.practice.jwt.service;

import com.practice.jwt.entity.User;
import com.practice.jwt.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.io.IOException;

@Component
@Slf4j
@RequiredArgsConstructor
public class JwtAuthFilter extends OncePerRequestFilter {

    private final UserRepository userRepository;
    private final HandlerExceptionResolver handlerExceptionResolver;

    private final AuthUtil util;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
       try{
        log.info(request.getRequestURI());

        final String requestToken = request.getHeader("Authorization");

        if(requestToken == null || !requestToken.startsWith("Bearer")){
            filterChain.doFilter(request,response);
            return;
        }

        String token = requestToken.split("Bearer ")[1];
        String username = util.getUsernameFromToken(token);

        if(username == null && SecurityContextHolder.getContext().getAuthentication() == null){
           User user = userRepository.findByUsername(username).orElseThrow();
            UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(username, null, user.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(userToken);

            filterChain.doFilter(request,response);

        }

       }catch(Exception e){
           handlerExceptionResolver.resolveException(request,response,null,e);
       }
    }
}
