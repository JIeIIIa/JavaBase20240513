package com.gmail.onishchenko.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MultiDimensionalArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int size = readInt(1, 20);
        int[][] matrix = generate(size, 1, 51);

        System.out.println("Generated matrix:");
        print(matrix);

        System.out.println("Sum in all even rows: " + sumAllRows(matrix, 0));
        System.out.println("Sum in all odd rows: " + sumAllRows(matrix, 1));

        System.out.println("Product in all even columns: " + productAllColumns(matrix, 0));
        System.out.println("Product in all odd columns: " + productAllColumns(matrix, 1));

        System.out.println("Magic square: " + isMagicSquare(matrix));
    }

    public static int[][] generate(int size, int origin, int bound) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = ThreadLocalRandom.current().nextInt(origin, bound);
            }
        }
        return matrix;
    }

    public static int readInt(int min, int max) {
        while (true) {
            System.out.printf("Enter a number between %d and %d: ", min, max);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= min && number <= max) {
                    return number;
                }
            }
            scanner.nextLine();
        }
    }

    public static void print(int[][] matrix) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\t" + Arrays.toString(matrix[i]));
        }
        System.out.println("]");
    }

    public static long sumAllRows(int[][] matrix, int initial) {
        long sum = 0;
        for (int i = initial; i < matrix.length; i += 2) {
            sum += sumRow(matrix, i);
        }
        return sum;
    }

    public static long sumRow(int[][] matrix, int row) {
        long sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    public static long productAllColumns(int[][] matrix, int initial) {
        long result = 1;
        for (int i = initial; i < matrix[0].length; i += 2) {
            result *= productColumn(matrix, i);
        }
        return result;
    }

    public static long productColumn(int[][] matrix, int column) {
        long result = 1;
        for (int[] row : matrix) {
            result *= row[column];
        }
        return result;
    }

    public static long sumColumn(int[][] matrix, int column) {
        long result = 0;
        for (int[] row : matrix) {
            result += row[column];
        }
        return result;
    }

    public static boolean isMagicSquare(int[][] matrix) {
        int sum = sumPrimaryDiagonal(matrix);

        if (sum != sumSecondaryDiagonal(matrix)) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (sum != sumRow(matrix, i)) {
                return false;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (sum != sumColumn(matrix, i)) {
                return false;
            }
        }

        return true;
    }

    public static int sumPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[i].length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        final int length = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][length - i - 1];
        }
        return sum;
    }

}
