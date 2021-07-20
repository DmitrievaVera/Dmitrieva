package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    //2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    // (например, в миске 10 еды, а кот пытается покушать 15-20).
    public void decreaseFood(Cat cat, int appetite) {
        if (food >= appetite) {
            food -= appetite;
            cat.setIsFull(true);
            System.out.printf("Кот %s покушал %s еды и теперь СЫТ ! :-) %n", cat.getName(), appetite);
        }
        else {System.out.printf("В миске недостаточно еды для кота. Кот %s не будет кушать и останется голодным :-(%n", cat.getName());}
    }

    public void showInfo() {
        System.out.println("plate: " + food);
    }

    //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void addFood(int valueFood)
    {
        food += valueFood;
        System.out.println("В тарелку добавлено " + valueFood + " еды");
    }
}