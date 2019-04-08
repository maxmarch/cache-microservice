package com.mpoznyak.cache.mapper.impl;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.model.Item;
import org.springframework.stereotype.Component;

public class ItemMapperImpl {


    public ItemDto map(Item e) {
        ItemDto d = new ItemDto();
        d.setId(e.getId());
        d.setValue(e.getValue());
        return d;
    }

    public Item map(ItemDto d) {
        Item e = new Item();
        e.setId(d.getId());
        e.setValue(d.getValue());
        return e;
    }

}
