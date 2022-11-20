package com.enigmacamp.jdbc1.view;

import com.enigmacamp.jdbc1.model.Product;
import com.enigmacamp.jdbc1.repo.ProductRepo;
import com.enigmacamp.jdbc1.service.ProductService;
import com.enigmacamp.jdbc1.util.DataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class MasterMenu {
    private static final Scanner in = new Scanner(System.in);
    private static Boolean isClosed = false;
    private static final Connection connection;

    static {
        try {
            connection = DataSourceFactory.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static final ProductRepo productRepo = new ProductRepo(connection);
    private static final ProductService productService = new ProductService(productRepo);

    private static String selectMenu() {
        String menu = "\n=== main menu ===\n" +
                "\n1. product\n" +
                "2. transaction\n" +
                "3. report\n" +
                "0. exit\n";
        System.out.println(menu);

        System.out.print("select menu : ");

        return in.nextLine();
    }

    public static void run() throws SQLException {
        System.out.println("=== welcome ===");
        startMenu();
    }

    private static void startMenu() throws SQLException {

        // test
//        Product product1 = new Product(0,"test",true,false);
//        productService.addProduct(product1);

        String selectedMenu = selectMenu();
        String selectedSubMenu;

        while (!isClosed) {
            try {
                if (selectedMenu.equalsIgnoreCase("1")) {
                    System.out.println("\n=== product ===");
                    selectedSubMenu = subMenuProduct();

                    if (selectedSubMenu.equalsIgnoreCase("0")) {
                        System.out.println("\n=== goodbye ===");
                        isClosed = true;
                        break;
                    }

                    startMenu();
                } else if (selectedMenu.equalsIgnoreCase("2")) {
                    System.out.println("\n=== transaction ===");
                    selectedSubMenu = subMenuTrx();

                    if (selectedSubMenu.equalsIgnoreCase("0")) {
                        System.out.println("\n=== goodbye ===");
                        isClosed = true;
                        break;
                    }

                    startMenu();
                } else if (selectedMenu.equalsIgnoreCase("3")) {
                    System.out.println("\n=== report ===");
                    selectedSubMenu = subMenuReport();

                    if (selectedSubMenu.equalsIgnoreCase("0")) {
                        System.out.println("\n=== goodbye ===");
                        isClosed = true;
                        break;
                    }

                    startMenu();
                } else if (selectedMenu.equalsIgnoreCase("0")) {
                    System.out.println("\n=== goodbye ===");
                    isClosed = true;
                    break;
                } else {
                    System.err.println("invalid input\n");
                    startMenu();
                }
            } catch (Exception e) {
                System.err.println("invalid input\n");
                startMenu();
            }
        }
    }

    private static String subMenuProduct() {
        String menu = "\n1. add a product\n" +
                "2. delete a product\n" +
                "3. detail product\n" +
                "0. exit\n";

        System.out.println(menu);

        System.out.print("select sub menu : ");

        String selectedSubMenu = in.nextLine();


        if (!selectedSubMenu.equalsIgnoreCase("0")) {
            if (selectedSubMenu.equalsIgnoreCase("1")) {
                System.out.println("\n=== add a product ===");

                System.out.println("product added");
                return selectedSubMenu;
            } else if (selectedSubMenu.equalsIgnoreCase("2")) {
                System.out.println("\n=== delete a product ===");
                return selectedSubMenu;
            } else if (selectedSubMenu.equalsIgnoreCase("3")) {
                System.out.println("\n=== report ===");
                return selectedSubMenu;
            } else {
                System.err.println("invalid input\n");
                return selectedSubMenu;
            }
        }

        return selectedSubMenu;
    }

    private static String subMenuTrx() {
        return "0";
    }

    private static String subMenuReport() {
        return "0";
    }
}
