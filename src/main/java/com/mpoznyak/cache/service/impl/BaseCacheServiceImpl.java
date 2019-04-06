package com.mpoznyak.cache.service.impl;

import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.service.BaseCacheService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by mpoznyak on 04.04.2019
 */

@Service
public class BaseCacheServiceImpl implements BaseCacheService {

    @Override
    public Item save(Item entity) {
        return null;
    }

    @Override
    public Iterable<Item> saveAll(Iterable<Item> entities) {
        return null;
    }

    @Override
    public Optional<Item> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<Item> findAll() {
        return null;
    }

    @Override
    public Iterable<Item> findAllById(Iterable<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Item entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Item> entities) {

    }

    @Override
    public void deleteAll() {

    }

}
