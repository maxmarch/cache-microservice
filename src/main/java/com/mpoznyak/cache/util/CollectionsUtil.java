package com.mpoznyak.cache.util;

import java.util.ArrayList;
import java.util.List;

public class CollectionsUtil<T> {

    public static <T> List<T> iterableToList(Iterable<T> items) {
        List<T> list = new ArrayList<>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }
}
