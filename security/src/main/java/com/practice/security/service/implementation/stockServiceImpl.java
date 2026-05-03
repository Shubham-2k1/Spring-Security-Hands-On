package com.practice.security.service.implementation;

import com.practice.security.entity.item;
import com.practice.security.entity.stock;
import com.practice.security.repository.stockRepo;
import com.practice.security.service.stockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class stockServiceImpl implements stockService {

    private final stockRepo stockRepo;

    @Override
    public Map<String, Integer> getStock() {
        return stockRepo.findAll().stream()
                .collect(Collectors.toMap(stock::getItem,stock::getCount));
    }
}
