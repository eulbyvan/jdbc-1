package com.enigmacamp.jdbc1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DataSourceFactory {
    private static Connection connection = null;
    private static void createConnection() throws SQLException {
        String dbHost = "localhost";
        String dbPort = "5432";
        String dbUser = "postgres";
        String dbName = "jdbc1";
        String dbPassword = "stupid";
        String dbUrl = String.format("jdbc:postgresql://%s:%s/%s", dbHost, dbPort, dbName);

        connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        connection.setAutoCommit(false);
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) createConnection();
        return connection;
    }

    public static void connectionClose() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}