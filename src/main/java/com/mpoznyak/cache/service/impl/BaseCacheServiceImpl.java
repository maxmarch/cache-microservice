package com.mpoznyak.cache.service.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.service.BaseCacheService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by mpoznyak on 04.04.2019
 */

@Service
public class BaseCacheServiceImpl implements BaseCacheService {

    @Override
    public ItemDto save(ItemDto entity) {
        return null;
    }

    @Override
    public List<ItemDto> saveAll(List<ItemDto> entities) {
        return null;
    }

    @Override
    public ItemDto findById(Long id) {
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public List<ItemDto> findAll() {
        return null;
    }

    @Override
    public List<ItemDto> findAllById(List<Long> ids) {
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
    public void delete(ItemDto entity) {

    }

    @Override
    public void deleteAll(List<ItemDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void update(ItemDto itemDto) {

    }
}
