package com.mpoznyak.cache.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.keyvalue.core.query.KeyValueQuery;
import org.springframework.data.mapping.context.MappingContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface BaseCacheRepository {

    <T> T insert(T var1);

    <T> T insert(Object var1, T var2);

    <T> Iterable<T> findAll(Class<T> var1);

    <T> Iterable<T> findAll(Sort var1, Class<T> var2);

    <T> Optional<T> findById(Object var1, Class<T> var2);

    <T> Iterable<T> findInRange(long var1, int var3, Class<T> var4);

    <T> Iterable<T> findInRange(long var1, int var3, Sort var4, Class<T> var5);

    <T> T update(T var1);

    void delete(Class<?> var1);

    <T> T delete(T var1);

    <T> T delete(Object var1, Class<T> var2);

    long count(Class<?> var1);

    long count(KeyValueQuery<?> var1, Class<?> var2);

}
