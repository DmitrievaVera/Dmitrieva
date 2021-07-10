package ru.geekbrains.lesson6;

//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., плавание: кот не умеет плавать).
public class Cat extends Animal {
    private static int countCats;

    public Cat(String name){
        super(name,200, 0);
        countCats++;
    }

    public void swim(int swimDistance){
        System.out.println("Коты не умеют плавать :(");
    }

    // Отдаём счёчик котов
    public static int getCount(){
        return countCats;
    }

}
