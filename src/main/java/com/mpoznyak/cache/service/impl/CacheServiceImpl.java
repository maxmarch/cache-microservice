package com.mpoznyak.cache.service.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.mapper.impl.ItemMapperImpl;
import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.repository.CacheRepository;
import com.mpoznyak.cache.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mpoznyak on 04.04.2019
 */

@Service
public class CacheServiceImpl implements GenericService {

    @Autowired
    private CacheRepository cacheRepository;

    private static final ItemMapperImpl ITEM_MAPPER = new ItemMapperImpl();

    @Override
    @Caching(
            put = {@CachePut(value = "value", key = "#itemDto.id")},
            evict = {@CacheEvict(value = "value", key = "#itemDto.id")}
    )
    public ItemDto add(ItemDto itemDto) {
        Item item = ITEM_MAPPER.map(itemDto);
        Item savedItem = cacheRepository.save(item);
        return ITEM_MAPPER.map(savedItem);
    }

    @Override
    public List<ItemDto> addAll(List<ItemDto> entities) {
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
