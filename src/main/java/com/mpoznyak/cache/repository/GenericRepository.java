package com.mpoznyak.cache.repository;

import java.util.Optional;

public interface GenericRepository<S, ID> {

    S save(S e);

    <S> Iterable<S> saveAll(Iterable<S> entities);

    Optional<S> findById(ID id);

    boolean existsById(ID id);

    Iterable<S> findAll();

    Iterable<S> findAllById(Iterable<ID> ids);

    Long count();

    void deleteById(ID id);

    void delete(S entity);

    void deleteAll(Iterable<? extends S> entities);

    void deleteAll();
}
