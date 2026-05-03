package com.practice.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String item;
    private String totalSale;
}
