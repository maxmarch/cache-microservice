package com.mpoznyak.cache.mapper;

import java.util.LinkedList;
import java.util.List;

/**
 * Generic mapper from entity classes to classes sent to frontend.
 * @param <V> classes sent to frontend.
 * @param <E> entity class.
 */
abstract public class GenericMapper<V, E> {

    /**
     * Convert List of entity classes to List of classes for frontend.
     * @param entityList List of entity-classes.
     * @return List of classes for frontend.
     */
    public List<V> map(List<E> entityList) {
        List<V> voList = new LinkedList<>();
        for (E e : entityList) {
            voList.add(map(e));
        }
        return voList;
    }

    /**
     * Convert entity class to classes sent to frontend
     * @param e entity class
     * @return classes sent to frontend
     */
    public abstract V map(E e);
}
