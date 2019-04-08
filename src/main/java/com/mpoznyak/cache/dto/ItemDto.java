package com.mpoznyak.cache.dto;

import java.io.Serializable;

public class ItemDto implements Serializable {

    private Long id;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
