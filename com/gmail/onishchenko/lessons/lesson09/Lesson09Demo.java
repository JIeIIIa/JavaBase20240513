package com.gmail.onishchenko.lessons.lesson09;

public class Lesson09Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int[][] matrix = new int[2][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

        System.out.println("        Another approach");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
