package ru.geekbrains.lesson2;

public class MainApp2 {

    public static void main(String[] args) {
        System.out.println(checkSum(67, 7));

        printNumber(-10);
        System.out.println(isNumberPositive(0));
        printString("Have a good day!", 3);
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void printNumber(int a)
    {
        if (a >= 0)
        {
            System.out.println("Число положительное!");
        }
        else
        {
            System.out.println("Число отрицательное!");
        }
    }
    public static boolean isNumberPositive(int a)
    {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    public static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }


}
