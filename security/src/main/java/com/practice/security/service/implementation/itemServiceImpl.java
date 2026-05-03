package com.practice.security.service.implementation;

import com.practice.security.entity.item;
import com.practice.security.repository.itemRepo;
import com.practice.security.service.itemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class itemServiceImpl implements itemService {

        private final itemRepo itemRepo;

    @Override
    public List<String> getItem(String category) {
        List<item> result = itemRepo.findByCategory(category);
            return result
                    .stream()
                    .map(item::getItemName)
                    .collect(Collectors.toList());
    }
}
