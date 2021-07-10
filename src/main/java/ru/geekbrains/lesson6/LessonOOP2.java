package ru.geekbrains.lesson6;

public class LessonOOP2 {
    public static void main(String[] args)
    {
        Cat cat1Murzik = new Cat("Мурзик");
        Dog dog1Graf = new Dog("Граф");
        Dog dog2Rex = new Dog("Рэкс");

        System.out.println("---- Действия " + cat1Murzik.name +"а ----");
        cat1Murzik.run(150);
        cat1Murzik.swim(5);

        System.out.println("---- Действия " + dog1Graf.name +"а ----");
        dog1Graf.run(550);
        dog1Graf.swim(9);

        System.out.println("---- Действия " + dog2Rex.name +"а ----");
        dog2Rex.run(300);
        dog2Rex.swim(12);

        System.out.println("---- Данные по животным ----");
        System.out.println("Животных всего: " + Animal.getCount());
        System.out.println("Кошек: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
    }
}
