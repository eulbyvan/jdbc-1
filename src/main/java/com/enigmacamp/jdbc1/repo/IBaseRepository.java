package com.enigmacamp.jdbc1.repo;

import java.util.List;

public interface IBaseRepository <T> {
    void create(T data);
    List<T> getRows();
    T getRow(Integer id);
    void update(Integer id, T data);
    void delete(Integer id);
}
