package com.enigmacamp.jdbc1.repo;

import com.enigmacamp.jdbc1.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductRepo implements IProductRepo{
    private final Connection connection;

    public ProductRepo(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Product product) throws SQLException {
        PreparedStatement statement = null;
        String sql = "insert into product(name, is_active, is_deleted) values (?, ?, ?)";

        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, product.getName());
            statement.setBoolean(2, product.getIsActive());
            statement.setBoolean(3, product.getIsDeleted());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Product> getRows() {
        return null;
    }

    @Override
    public Product getRow(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Product data) {

    }

    @Override
    public void delete(Integer id) {

    }
}
