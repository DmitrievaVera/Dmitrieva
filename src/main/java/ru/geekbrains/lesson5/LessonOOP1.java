package ru.geekbrains.lesson5;

public class LessonOOP1 {
    public static void main(String[] args){

        // 4. Создать массив из 5 сотрудников.
        Employee[] arrEmployees = new Employee[5];
        arrEmployees[0] = new Employee("Петров Пётр Петрович", "Директор", "ceo@company.com", "+7-123-456-78-01", 120000, 45);
        arrEmployees[1] = new Employee("Александрова Альбина Антоновна", "Бухгалтер", "buh@company.com", "+7-123-456-78-02", 90000, 40);
        arrEmployees[2] = new Employee("Богданов Эрик Миронович", "Ведущий программист", "bogdanov@company.com", "+7-123-456-78-03", 100000, 41);
        arrEmployees[3] = new Employee("Овчинников Илларион Васильевич", "Программист", "ovchinnikov@company.com", "+7-123-456-78-04", 80000, 35);
        arrEmployees[4] = new Employee("Жуков Мартин Давидович", "IT-инженер", "jukov@company.com", "+7-123-456-78-04", 60000, 25);

        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        printOverAge(arrEmployees, 40);

    }

    public static void printOverAge(Employee[] arr, int minAge){
        for (Employee employee : arr) {
            if (employee.age > minAge) {
                System.out.println("---------------------------");
                employee.employeeInfoOut();
                System.out.println();
            }
        }
    }
}