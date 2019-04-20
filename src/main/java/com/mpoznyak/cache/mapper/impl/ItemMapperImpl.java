package com.mpoznyak.cache.mapper.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.mapper.GenericMapper;
import com.mpoznyak.cache.model.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ItemMapperImpl extends GenericMapper<ItemDto,Item> {

    @Override
    public ItemDto map(Item item) {
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setValue(item.getValue());
        return itemDto;
    }

    public Item map(ItemDto d) {
        Item item = new Item();
        item.setId(d.getId());
        item.setValue(item.getValue());
        return item;
    }
}
