package com.gmail.onishchenko.lessons.lesson09;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson09Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));

        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2, 3, 3, 3, 3, 3,3};
        matrix[2] = new int[]{4, 5, 6, 7, 8, 9};
        System.out.println();

        print(matrix);

        System.out.println("        Another approach");
        int[][] anotherMatrix = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < anotherMatrix.length; i++) {
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("        Random matrix");
        int[][] randomMatrix = generateRandomMatrix(3, 5);
//        print(randomMatrix);

        System.out.println(Arrays.deepToString(randomMatrix));
        randomMatrix = null;
        System.out.println(Arrays.deepToString(randomMatrix));
    }

    private static int[][] generateRandomMatrix(int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
        return result;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            if (row == null) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
}
