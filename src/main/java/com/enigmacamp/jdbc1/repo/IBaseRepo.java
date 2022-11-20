package com.enigmacamp.jdbc1.repo;

import java.sql.SQLException;
import java.util.List;

public interface IBaseRepo<T> {
    void create(T data) throws SQLException;
    List<T> getRows();
    T getRow(Integer id);
    void update(Integer id, T data);
    void delete(Integer id);
}
