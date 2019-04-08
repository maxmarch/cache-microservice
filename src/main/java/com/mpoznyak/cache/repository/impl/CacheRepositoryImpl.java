package com.mpoznyak.cache.repository.impl;

import com.mpoznyak.cache.repository.BaseCacheRepository;
import com.mpoznyak.cache.model.Item;
import org.springframework.data.domain.Sort;
import org.springframework.data.keyvalue.core.KeyValueOperations;
import org.springframework.data.keyvalue.core.query.KeyValueQuery;
import org.springframework.data.keyvalue.repository.support.SimpleKeyValueRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.EntityInformation;

import java.util.Optional;

public class CacheRepositoryImpl implements BaseCacheRepository {


    @Override
    public <T> T insert(T var1) {
        return null;
    }

    @Override
    public <T> T insert(Object var1, T var2) {
        return null;
    }

    @Override
    public <T> Iterable<T> findAll(Class<T> var1) {
        return null;
    }

    @Override
    public <T> Iterable<T> findAll(Sort var1, Class<T> var2) {
        return null;
    }

    @Override
    public <T> Optional<T> findById(Object var1, Class<T> var2) {
        return Optional.empty();
    }

    @Override
    public <T> Iterable<T> findInRange(long var1, int var3, Class<T> var4) {
        return null;
    }

    @Override
    public <T> Iterable<T> findInRange(long var1, int var3, Sort var4, Class<T> var5) {
        return null;
    }

    @Override
    public <T> T update(T var1) {
        return null;
    }

    @Override
    public void delete(Class<?> var1) {

    }

    @Override
    public <T> T delete(T var1) {
        return null;
    }

    @Override
    public <T> T delete(Object var1, Class<T> var2) {
        return null;
    }

    @Override
    public long count(Class<?> var1) {
        return 0;
    }

    @Override
    public long count(KeyValueQuery<?> var1, Class<?> var2) {
        return 0;
    }
}
