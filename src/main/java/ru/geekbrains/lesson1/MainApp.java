package ru.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {

        MainApp test = new MainApp();
        test.printHello();
        test.printThreeWords();
        test.checkSumSign();
        test.printColor();
        test.compareNumbers();
    }

    public static void printHello() {
        System.out.println("Hello, World!");
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = 4;
        int b = -10;
        if (a + b >= 0) {
            System.out.println("сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 25;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 || value <= 100) {
                System.out.println("yellow");
        } else if (value > 100) {
    System.out.println("green");
        }
    }

    public static void compareNumbers() {
        int a = 0;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
}
}