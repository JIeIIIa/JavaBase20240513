package com.gmail.onishchenko.lessons.lesson08;

public class Lesson08Demo {
    public static void main(String[] args) {
//        demo3();
        int[] array = {1, 4, 3, -10, 2};
        print(array);
        reverseBubbleSort(array);
        System.out.println("Bubble sort:");
        print(array);

    }

    /**
     * O(1)
     */
    public static int sumPair(int a, int b) {
        return a + b;
    }

    /**
     * O(1)
     */
    public static int sumPair2(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * O(N) = 4*N ~ N
     */
    public static void demo1() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * З точки зору команд процесораа, цей варіант повільніший
     * Але BigO демонструє як себе поводить алгоритм
     * O(N)
     */

    public static void demo2() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * O(N)
     */
    // f(n) = n
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * O(N)
     */
    // g(n) == n + g(n-1);
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursion(n - 1);
        }
    }

    /**
     * O(N) = 2*N ~ N
     */
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sumPair2(i, i + 1, 1);
        }
        return sum;
    }

    /**
     * O(N^2) ~ n^2 - 4*n
     * O(N) * O(N)
     */
    public static void demo3() {
        int n = 10;
        int steps = 0;
        for (int i = 0; i < n - 4; i++) { // n
            for (int j = 0; j < n; j++) { //
                System.out.print(i * j + " ");
                steps++;
            }
            System.out.println();
        }
        System.out.println(steps); // n* (n - 4) ~ n^2
    }

    /**
     * O(N^3)
     */
    public static void demo4() {
        int n = 10;
        for (int i = 0; i < n; i++) { // n * (N^2)
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {

                }
            }
        }
    }


    // 1 4 5 6 9 14 15 20 21
    // 4


    /**
     * O(logN)
     * Найгірший варіант для масива із 16 елементів
     * N = 16 - 2^4
     * N = 8 - 2^3
     * N = 4 - 2^2
     * N = 2 - 2^1
     * N = 1 - 2^0
     * <p>
     * 2^4=16 - 2^k = N тоді з математики відомо, що   k = log2N
     * O(k) = O(log2N)
     * Основа логорифма не береться до уваги, logA(N) = logB(N)/logB(A), а 1/logB(A) = константа:
     * O(k) = O(logN)
     */
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Повертаємо індекс, якщо знайдено
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Повертаємо -1, якщо не знайдено
    }

    // O(N^2)
    public static void bubbleSort(int[] array) {
        System.out.println("Bubble sort is running...");
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            print(array);
            for (int j = 0; j < array.length - i - 1; j++) {
                step++;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        System.out.println("Step == " + step);
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.printf("%5d", element);
        }
        System.out.println();
    }


    public static void reverseBubbleSort(int[] array) {
        System.out.println("Bubble sort is running...");
        int step = 0;
        for (int i = 0; i < array.length; i++) {
            print(array);
            for (int j = 0; j < array.length - i - 1; j++) {
                step++;
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        System.out.println("Step == " + step);
    }





    public static void bubbleSortVersion2(int[] array) {
        int step = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                step++;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
//            print(array);
            System.out.println();
        }
        System.out.println("step == " + step);
    }

    public static void bubbleSortReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }
}
