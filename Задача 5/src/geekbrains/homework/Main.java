package geekbrains.homework;

import java.util.Scanner;

public class Main {
  //Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000
    private static void ZP1 () {
        int i = 0;
        int p = 0;
        Сотрудники[] a = new Сотрудники[5];
        if (a[i].age > 45) a[i].zp = a[i].zp + 5000;
        for (i = 0; i < a.length; i++)
                p++;
                System.out.println(p + ". " + a[i]);
    }
// Подсчитать средние арифметические зарплаты и возраста(7 задание), номер выводится везде (8 задание)
    private static void SR () {
        int i;
        int p = 0;
        int srv=0;
        int srzp=0;
        Сотрудники[] a = new Сотрудники[5];
        for (i = 0; i < a.length; i++) {
            p++;
            srv=(srv+a[i].age)/5;
            srzp=(srzp+a[i].age)/5;}
            System.out.println("Средний возраст: "+ srv);
        System.out.println("Средняя зп: "+ srzp);
        }

        public static void main(String[] args) {
        //5 задание
        Сотрудники[] a = new Сотрудники[5];
        int p = 0;
        a[0] = new Сотрудники
                ("Никитина Мария Николаевна", 25000, 19);
        a[1] = new Сотрудники
                ("Никитин Василий Михайлович", 80700, 23);
        a[2] = new Сотрудники
                ("Максимова Анастасия Александровна", 55000, 19);
        a[3] = new Сотрудники
                ("Матвеева Маргарита Алексеевна", 66000, 19);
        a[4] = new Сотрудники
                ("Полынцова Дарья Владимировна", 53000, 65);
        for (int i = 0; i < a.length; i++)
            if (a[i].age > 40) {
                p++;
                System.out.println(p + ". " + a[i]);
            }
//Почему-то не работает(
            System.out.println("Средний возраст: ");
        ZP1();
            //Подсчитать средние арифметические зарплаты и возраста, тоже не работает
            System.out.println("Средняя зарплата: ");
            SR();
    }
}