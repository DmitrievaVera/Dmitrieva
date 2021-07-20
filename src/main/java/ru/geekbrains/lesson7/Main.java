package ru.geekbrains.lesson7;

public class Main {
    public static void main(String[] args) {
        //5. Создать массив котов и тарелку с едой,
        // попросить всех котов покушать из этой тарелки и
        // потом вывести информацию о сытости котов в консоль.
        Cat[] cats = {
                new Cat("Барсик", 4 ),
                new Cat("Мурзик", 8 ),
                new Cat("Борис", 12)
        };

        Plate plate1 = new Plate(20);

        System.out.println("--- Начинаем ---");
        plate1.showInfo();

        for (Cat cat : cats) {
            cat.eat(plate1);
            plate1.showInfo();
        }

        plate1.addFood(50);
        plate1.showInfo();

        for (Cat cat : cats)
        {
            cat.eat(plate1);
            plate1.showInfo();
        }
    }
}