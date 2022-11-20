package com.enigmacamp.jdbc1.view;

import com.enigmacamp.jdbc1.model.Product;
import com.enigmacamp.jdbc1.repo.ProductRepo;
import com.enigmacamp.jdbc1.service.ProductService;
import com.enigmacamp.jdbc1.util.DataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MasterMenu {
    private static final Scanner in = new Scanner(System.in);
    public String selectMenu() {
        String menu = "1. product\n" +
                "2. transaction\n" +
                "3. report\n" +
                "0. exit\n";
        System.out.println(menu);

        System.out.print("select menu : ");

        return in.nextLine();
    }

    public void run() throws SQLException {
        System.out.println("=== welcome ===\n");
        startMenu();
    }

    public void startMenu() throws SQLException {

        Connection connection = DataSourceFactory.getConnection();

        ProductRepo productRepo = new ProductRepo(connection);
        ProductService productService = new ProductService(productRepo);


        // test
//        Product product1 = new Product(0,"test",true,false);
//        productService.addProduct(product1);

        String selectedMenu = selectMenu();
        String selectedSubMenu;
        int isExit = 0;

        while (isExit == 0) {
            try {
                switch (selectedMenu) {
                    case "1":
                        System.out.println("\n=== product ===\n");
                        selectedSubMenu = subMenuProduct();

                        if (selectedSubMenu.equalsIgnoreCase("0")) {
                            System.out.println("\n=== goodbye ===\n");
                            isExit = 1;
                            break;
                        }

                        startMenu();
                    case "2":
                        System.out.println("\n=== transaction ===\n");
                        subMenuTrx();

                        startMenu();
                    case "3":
                        System.out.println("\n=== report ===\n");
                        subMenuReport();

                        startMenu();
                    case "0":
                        System.out.println("\n=== goodbye ===\n");
                        isExit = 1;
                        break;
                }
            } catch (Exception e) {
                System.out.println("invalid input");
                startMenu();
            }
        }

    }

    public String subMenuProduct() {
        String menu =   "1. add a product\n" +
                        "2. delete a product\n" +
                        "3. detail product\n" +
                        "0. exit\n";

        System.out.println(menu);

        System.out.print("select sub menu : ");

        String selectedSubMenu = in.nextLine();


        switch (selectedSubMenu) {
            case "1":
                System.out.println("\n=== add a product ===\n");
                break;
            case "2":
                System.out.println("\n=== delete a product ===\n");
                break;
            case "3":
                System.out.println("\n=== report ===\n");
                break;
            case "0":
                break;
        }

        return selectedSubMenu;

    }

    public void subMenuTrx() {

    }

    public void subMenuReport() {

    }
}