package com.gmail.onishchenko.homework;

public class SaleStatistics {
    public static void main(String[] args) {
        String product = "smartphone";
        int days = 5;
        double sales = 12153.41;
        double averageSales = sales / days;

        System.out.printf("Product No 1: %s,\n", product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, sales);
        System.out.printf("sales by day is EUR %.2f.\n", averageSales);


        product = "laptop";
        days = 7;
        sales = 10486.85;
        averageSales = sales / days;

        System.out.printf("Product No 2: %s,\n", product);
        System.out.printf("total sales for %d days is EUR %.2f,\n", days, sales);
        System.out.printf("sales by day is EUR %.2f.\n", averageSales);

    }
}
