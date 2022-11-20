package com.enigmacamp.jdbc1.service;

import com.enigmacamp.jdbc1.model.Product;
import com.enigmacamp.jdbc1.repo.IProductRepo;
import com.enigmacamp.jdbc1.repo.ProductRepo;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public void addProduct(Product product) throws SQLException {
        productRepo.create(product);
        System.out.println("new product added");
    }

    @Override
    public Product findProduct(Integer id) {
        return null;
    }

    @Override
    public List<Product> findProducts() {
        return null;
    }

    @Override
    public void editProduct(Integer id) {

    }

    @Override
    public void deleteProduct(Integer id) {

    }
}
