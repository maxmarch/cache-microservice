package com.mpoznyak.cache.repository;

import com.mpoznyak.cache.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface CacheRepository extends CrudRepository<Item, Long> {

}
