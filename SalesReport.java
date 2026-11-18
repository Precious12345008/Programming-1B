
package com.mycompany.salesreport;

import java.util.Scanner;

public class SalesReport {

    private static int j;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] names = {"Cozy Nights Monarch Mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};
        
        int[][] sales = new int[3][3];
        
        for ( int i = 0; i < 3; j ++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number od sales for month" + ( j + 1) + "for " + names[i] + ": ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        Product product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);
        
        System.out.println("Product Sales Report 2026");
        
        System.out.println("=======");
        printer.PrintTotalSales();
        printer.PrintAverageSales();
        printer.PrintMostPopularProducts();
    }

    public static class Product {

        public Product() {
        }

        public Product(String[] names, int[][] sales) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public double GetAverageProductSold() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public short GetTotalProductsSold() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }
}
