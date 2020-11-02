package geekbraind.homework;

//Задача 1: Создали класс "Сотрудник" с данными полями:
public class Сотрудник {
    String fio;
    int zp;
    int age;

    //Задача 2: Создали конструктор
    Сотрудник(String fio, int zp, int age) {
        this.fio = fio;
        this.zp = zp;
        this.age = age;
    }
//Методы Вывода ФИО, ЗП, ВОЗРАСТА, получилось сделать только так
    void FIO (){
        System.out.printf("ФИО: %s", fio);
    }
    void ZP (){
        System.out.printf("Зарплата: %d", zp);
    }
    void AGE (){
        System.out.printf("Возраст: %d", age);
    }

}