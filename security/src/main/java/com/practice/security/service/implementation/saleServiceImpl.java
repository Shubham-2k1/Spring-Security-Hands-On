package com.practice.security.service.implementation;

import com.practice.security.entity.sale;
import com.practice.security.repository.saleRepo;
import com.practice.security.service.saleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class saleServiceImpl implements saleService {

    private final saleRepo saleRepo;

    @Override
    public Map<String,String> getSale(){
        return saleRepo.findAll()
                .stream()
                .collect(Collectors.toMap(sale::getItem,sale::getTotalSale));
    }
}
