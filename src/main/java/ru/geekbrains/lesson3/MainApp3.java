package ru.geekbrains.lesson3;
import java.util.Arrays;

public class MainApp3 {

    public static void main(String[] args) {
        changeZerosAndOnes();
        printNumbers();
        numbersMultiplyTwo();
        matrix();
        int[] arr1 = generateArray(5, 666);
        System.out.println(Arrays.toString(arr1));
        findMinMax();
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //   С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void changeZerosAndOnes() {
        int arr[] = {1, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив длиной 100.
    //   С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void printNumbers() {
        int arr[] = new int[100];
        for (int i = 0; i<100; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void numbersMultiplyTwo() {
     int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    //    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    //    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
    //    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void matrix() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr[i].length - i - 1] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    //Task 5
    public static int[] generateArray(int len, int val) {
        int[] arr = new int[len];
        for (int i =0; i < len; i++) {
            arr[i] = val;
        }
        return arr;
    }

    //Task 6
    public static void findMinMax() {
        int[] arr = {1,4,5,7,8,9,2,4,5,7,0};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min=" + min + ": max=" + max);
    }
    
}