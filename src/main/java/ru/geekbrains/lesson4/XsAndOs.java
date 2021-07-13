package ru.geekbrains.lesson4;
import java.util.Random;
import java.util.Scanner;


public class XsAndOs {
    static char[][] map;
    static final int SIZE = 3;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек");
                break;
            }
            // проверка ничьи
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            // ход ИИ
            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил Т-1000");
                break;
            }
            // проверка ничьи
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }

    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++)
        {
            for (int columns = 0; columns < SIZE; columns++)
            {
                map[row][columns] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int row = 0; row < SIZE; row++)
        {
            System.out.print((row + 1) + " ");
            for (int column = 0; column < SIZE; column++)
            {
                System.out.print(map[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static void aiTurn() {
        Random random = new Random();
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static boolean isCellValid(int x, int y) {
        return (x >= 0 && x <= SIZE && y >= 0 && y <= SIZE && map[y][x] == DOT_EMPTY);
    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char winChar){
        for (int i = 0; i < SIZE; i++) {
            if (checkHorizontal(i, winChar) || checkVertical(i, winChar)) return true;
        }
        for (int i = 0; i <= SIZE - DOTS_TO_WIN; i++) {
            for (int j = 0; j <= SIZE - DOTS_TO_WIN; j++) {
                if (checkLeftDiagonal(i, j, winChar) || checkRightDiagonal(i + DOTS_TO_WIN - 1, j, winChar)) return true;
            }
        }
        return false;
    }

    private static boolean checkHorizontal(int y, char winChar) {
        int counter = 0;
        int x = 0;
        while (counter < DOTS_TO_WIN && x < SIZE) {
            if (map[x][y] == winChar) { counter++; }
            else { counter = 0; }
            x++;
        }
        return counter == DOTS_TO_WIN;
    }

    private static boolean checkVertical(int x, char winChar) {
        int counter = 0;
        int y = 0;
        while (counter < DOTS_TO_WIN && y < SIZE) {
            if (map[x][y] == winChar) { counter++; }
            else { counter = 0; }
            y++;
        }
        return counter == DOTS_TO_WIN;
    }

    private static boolean checkLeftDiagonal(int cur_x, int cur_y, char winChar) {
        int countWinChar = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cur_x + i][cur_y + i] == winChar) countWinChar++;
        }
        return countWinChar == DOTS_TO_WIN;
    }

    private static boolean checkRightDiagonal(int cur_x, int cur_y, char winChar) {
        int countWinChar = 0;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cur_x - i][cur_y + i] == winChar) countWinChar++;
        }
        return countWinChar == DOTS_TO_WIN;
    }
}
