package ru.geekbrains.lesson6;

//3. У каждого животного есть ограничения на действия
// (бег: собака 500 м.; плавание: собака 10 м.).
public class Dog extends Animal{
    private static int countDogs;

    public Dog(String name){
        super(name, 500, 10);
        countDogs++;
    }

    // Отдаём счёчик собак
    public static int getCount(){
        return countDogs;
    }
}
