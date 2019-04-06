package com.mpoznyak.cache.mapper;

import java.util.ArrayList;
import java.util.List;

public interface GenericMapper<E, D> {

   D map(E e);

   default List<D> map(List<E> elems) {
       List<D> list = new ArrayList<>();
       for (E elem : elems) {
           D d = map(elem);
           list.add(d);
       }
       return list;
   }
}
