package com.practice.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class webSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity.authorizeHttpRequests(auth -> auth
                                .requestMatchers("/homepage").permitAll()
                                .requestMatchers("/owner/*").hasRole("OWNER")
                                .requestMatchers("/client/*").hasRole("CLIENT")
                                .anyRequest().authenticated()
                        )
                .formLogin(form -> form
                        .defaultSuccessUrl("/loginSuccess")
                        .failureUrl("/loginFail"))
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails owner = User.withUsername("owner").password(passwordEncoder().encode("owner")).roles("OWNER").build();
        UserDetails client = User.withUsername("client").password(passwordEncoder().encode("client")).roles("CLIENT").build();

        return new InMemoryUserDetailsManager(owner,client);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
