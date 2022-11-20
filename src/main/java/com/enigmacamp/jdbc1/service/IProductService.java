package com.enigmacamp.jdbc1.service;

import com.enigmacamp.jdbc1.model.Product;
import com.enigmacamp.jdbc1.model.ProductDetail;

import java.sql.SQLException;
import java.util.List;

public interface IProductService {
    void addProduct(Product product) throws SQLException;
    Product findProduct(Integer id);
    List<Product> findProducts();
    void editProduct(Integer id);
    void deleteProduct(Integer id);
}
