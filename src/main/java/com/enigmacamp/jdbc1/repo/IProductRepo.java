package com.enigmacamp.jdbc1.repo;

import com.enigmacamp.jdbc1.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepo extends IBaseRepo <Product> {
    @Override
    void create(Product product) throws SQLException;

    @Override
    List<Product> getRows();

    @Override
    Product getRow(Integer id);

    @Override
    void update(Integer id, Product data);

    @Override
    void delete(Integer id);
}
