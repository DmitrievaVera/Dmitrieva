package ru.geekbrains.lesson6;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
public abstract class Animal {

    //2. Все животные могут бежать и плыть.
    int maxRun, maxSwim;
    private static int countAnimals;
    String name;

    public Animal(String name, int maxRun, int maxSwim){
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.name = name;
        countAnimals++;
    }

    // Отдаём счёчик животных
    public static int getCount(){
        return countAnimals;
    }

    // В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль.
    // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

    public void run(int runDistance){
        if (runDistance > maxRun){
            System.out.println(name + " не сможет столько пробежать. МАКС для этого вида животного: " + maxRun + " м");
        }
        else {
            System.out.println(name + " пробежал(а) " + runDistance + " м");
        }
    }

    public void swim(int swimDistance){
        if (swimDistance > maxSwim){
            System.out.println(name + " не сможет столько проплыть. МАКС для этого вида животного: " + maxSwim + " м");
        }
        else {
            System.out.println(name + " проплыл(а) " + swimDistance + " м");
        }
    }
}
