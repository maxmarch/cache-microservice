package com.mpoznyak.cache.mapper.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.mapper.GenericMapper;
import com.mpoznyak.cache.model.Item;

public class ItemMapperImpl implements GenericMapper<Item, ItemDto>  {


    @Override
    public ItemDto map(Item e) {
        ItemDto d = new ItemDto();
        d.setId(e.getId());
        d.setValue(e.getValue());
        return d;
    }
}
