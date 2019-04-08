package com.mpoznyak.cache.service;

import com.mpoznyak.cache.dto.ItemDto;
import com.mpoznyak.cache.model.Item;

import java.util.List;
import java.util.Optional;

public interface BaseCacheService {

    ItemDto save(ItemDto entity);

    /**
     * Saves all given entities.
     *
     * @param entities must not be {@literal null}.
     * @return the saved entities will never be {@literal null}.
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    List<ItemDto> saveAll(List<ItemDto> entities);

    /**
     * Retrieves an entity by its id.
     *
     * @param id must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    ItemDto findById(Long id);

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param id must not be {@literal null}.
     * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
     * @throws IllegalArgumentException if {@code id} is {@literal null}.
     */
    boolean existsById(Long id);

    /**
     * Returns all instances of the type.
     *
     * @return all entities
     */
    List<ItemDto> findAll();

    /**
     * Returns all instances of the type with the given IDs.
     *
     * @param ids
     * @return
     */
    List<ItemDto> findAllById(List<Long> ids);

    /**
     * Returns the number of entities available.
     *
     * @return the number of entities
     */
    long count();

    /**
     * Deletes the entity with the given id.
     *
     * @param id must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    void deleteById(Long id);

    /**
     * Deletes a given entity.
     *
     * @param entity
     * @throws IllegalArgumentException in case the given entity is {@literal null}.
     */
    void delete(ItemDto entity);

    /**
     * Deletes the given entities.
     *
     * @param entities
     * @throws IllegalArgumentException in case the given {@link Iterable} is {@literal null}.
     */
    void deleteAll(List<ItemDto> entities);

    /**
     * Deletes all entities managed by the repository.
     */
    void deleteAll();

}
