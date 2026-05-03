package com.practice.security.controller;

import com.practice.security.service.implementation.saleServiceImpl;
import com.practice.security.service.implementation.stockServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/owner")
public class ownerController {

    @Autowired
    private stockServiceImpl stockService;

    @Autowired
    private saleServiceImpl saleService;


    @GetMapping("/getStock")
    public Map<String,Integer> getStock(){
        return stockService.getStock();
    }

    @GetMapping("/getSales")
    public Map<String,String> getSales(){
        return saleService.getSale();
    }
}
