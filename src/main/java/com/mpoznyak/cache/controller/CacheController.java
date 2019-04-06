package com.mpoznyak.cache.controller;

import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.service.BaseCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mpoznyak on 04.04.2019
 */


@RestController
public class CacheController {

    private BaseCacheService baseCacheService;

    private static final Item EMPTY_ITEM = new Item();

    @GetMapping("/item/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long id) {
        Item item = baseCacheService.findById(id).orElse(EMPTY_ITEM);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @Autowired
    public void setBaseCacheService(BaseCacheService baseCacheService) {
        this.baseCacheService = baseCacheService;
    }

}
