package com.enigmacamp.jdbc1;

import com.enigmacamp.jdbc1.view.MasterMenu;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        MasterMenu masterMenu = new MasterMenu();

        try {
            masterMenu.run();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
