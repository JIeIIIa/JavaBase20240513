package com.gmail.onishchenko.lesson07;

public class Lesson07Demo {
    public static void main(String[] args) {
        int size = 14;
        int[] ages = {16, 20, 22, 43, 12, 42, 53, 54};


        calculateAverage(ages);

        calculateAverageWithForEach(ages);
        double averageAge;

        ages = new int[4];
        ages[0] = 20;
        ages[1] = 20;
        ages[2] = 22;
        ages[3] = 20;
        averageAge = (ages[0] + ages[1] + ages[2] + ages[3]) / 4.0;
        System.out.println("Average age is: " + averageAge);

        int[] emptyArray = {};
        emptyArray = new int[0];
        calculateAverage(emptyArray);
    }

    private static void calculateAverageWithForEach(int[] ages) {
        System.out.println("  ==== 2 ====");
        double sum = 0;
        for (double age : ages) {
            sum += age;
        }

        double averageAge = sum / ages.length;
        System.out.println("Average age is: " + averageAge);
    }

    private static void calculateAverage(int[] ages) {
        System.out.println("  ==== 1 ====");
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            System.out.println(i + ")" + ages[i]);
            sum += ages[i];
        }
        double averageAge = ages.length > 0 ? (double) sum / ages.length : -1;
        System.out.println("Average age is: " + averageAge);
    }
}
