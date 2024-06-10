package com.gmail.onishchenko.lessons.lesson09;

public class Lesson09Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int[][] matrix = new int[3][];
        matrix[0] = new int[]{1, 2, 3, 3, 3, 3, 3,3};
        matrix[2] = new int[]{4, 5, 6, 7, 8, 9};
        System.out.println();

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

        System.out.println("        Another approach");
        int[][] anotherMatrix = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < anotherMatrix.length; i++) {
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
