package com.mpoznyak.cache.controller;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.service.BaseCacheService;
import com.mpoznyak.cache.util.CollectionsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by mpoznyak on 04.04.2019
 */

@RestController
public class CacheController {

    private BaseCacheService cacheService;

    private static final Item EMPTY_ITEM = new Item();

    @GetMapping("/item/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long id) {
        Item item = cacheService.findById(id).orElse(EMPTY_ITEM);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @GetMapping("/item/")
    public ResponseEntity<List<Item>> findAll() {
        Iterable<Item> itemsIterable = cacheService.findAll();
        List<Item> itemsList = CollectionsUtil.iterableToList(itemsIterable);
        return new ResponseEntity<>(itemsList, HttpStatus.OK);
    }

//    @PostMapping("/item")
//    public ResponseEntity<Void> addItem(@RequestBody ItemDto item, UriComponentsBuilder builder) {
//
//    }

    @Autowired
    public void setCacheService(BaseCacheService cacheService) {
        this.cacheService = cacheService;
    }

}
