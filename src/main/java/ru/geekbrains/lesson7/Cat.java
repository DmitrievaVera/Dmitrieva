package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;

    //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        //(когда создаем котов, они голодны)
        this.isFull = false;
    }

    public void setIsFull(boolean isFullValue) {
        isFull = isFullValue;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(this, appetite);
    }

    public String getName() {
        return name;
    }
}