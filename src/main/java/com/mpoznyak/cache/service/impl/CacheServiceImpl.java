package com.mpoznyak.cache.service.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.mapper.impl.ItemMapperImpl;
import com.mpoznyak.cache.model.Item;
import com.mpoznyak.cache.repository.CacheRepository;
import com.mpoznyak.cache.service.GenericService;
import com.mpoznyak.cache.util.CollectionsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mpoznyak on 04.04.2019
 */

@Service
public class CacheServiceImpl implements GenericService {

    @Autowired
    private CacheRepository cacheRepository;

    private static final ItemMapperImpl ITEM_MAPPER = new ItemMapperImpl();
    private static final ItemDto EMPTY_ITEM = new ItemDto();

    @Override
    @Caching(
            put = {@CachePut(value = "itemValue", key = "#itemDto.id")},
            evict = {@CacheEvict(value = "itemValue", key = "#itemDto.id")}
    )
    public ItemDto add(ItemDto itemDto) {
        Item item = ITEM_MAPPER.map(itemDto);
        Item savedItem = cacheRepository.save(item);
        return ITEM_MAPPER.map(savedItem);
    }

    /**
     * Add all items. Used {@link CacheServiceImpl#add(ItemDto)} for final persisting data and caching it.
     *
     * @param items items to persist
     * @return result list of items saved in cache
     */
    @Override
    public List<ItemDto> addAll(List<ItemDto> items) {
        List<ItemDto> itemsSaved = new ArrayList<>();
        for (ItemDto itemDto : items) {
            ItemDto itemSavedDto = add(itemDto);
            itemsSaved.add(itemSavedDto);

        }
        return itemsSaved;
    }

    @Override
    @Cacheable(value = "itemValue", key = "#id")
    public ItemDto findById(Long id) {
        Item item = cacheRepository.findById(id).orElse(null);
        if (item == null) {
            return EMPTY_ITEM;
        }
        return ITEM_MAPPER.map(item);
    }

    @Override
    public boolean existsById(Long id) {
        return cacheRepository.existsById(id);
    }

    @Override
    public List<ItemDto> findAll() {
        Iterable iterableItems = cacheRepository.findAll();
        List<Item> itemList = CollectionsUtil.iterableToList(iterableItems);
        return ITEM_MAPPER.map(itemList);

    }

    @Override
    public List<ItemDto> findAllById(List<Long> ids) {
        Iterable<Item> iterableItems = cacheRepository.findAllById(ids);
        List<Item> itemList = CollectionsUtil.iterableToList(iterableItems);
        return ITEM_MAPPER.map(itemList);
    }

    @Override
    public long count() {
        return cacheRepository.count();
    }

    @Override
    @CacheEvict(value = "itemValue", key = "#id")
    public void deleteById(Long id) {
        cacheRepository.deleteById(id);
    }

    @Override
    @CacheEvict(value = "itemValue")
    public void delete(ItemDto itemDto) {
        Item item = ITEM_MAPPER.map(itemDto);
        cacheRepository.delete(item);
    }

    @Override
    @CacheEvict(value = "itemValue", allEntries = true)
    public void deleteAll() {
        cacheRepository.deleteAll();
    }

    @Override
    public void deleteAll(List<ItemDto> itemDtos) {
        List<Item> items = new ArrayList<>();
        for (ItemDto dto : itemDtos) {
            Item item = new Item();
            item.setId(dto.getId());
            item.setValue(dto.getValue());
            items.add(item);
        }
        cacheRepository.deleteAll(items);
    }

    @Override
    public void update(ItemDto itemDto) {
        Item item = ITEM_MAPPER.map(itemDto);
        cacheRepository.save(item);
    }
}
