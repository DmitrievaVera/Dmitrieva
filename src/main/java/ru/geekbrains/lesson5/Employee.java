package ru.geekbrains.lesson5;


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String fio, position, email, phone;
    int salary, age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void employeeInfoOut() {
        System.out.println("ФИО: " + fio);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Тел.: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}
