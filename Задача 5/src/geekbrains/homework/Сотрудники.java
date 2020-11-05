package geekbrains.homework;

//1 задание
public class Сотрудники {
    String fio;
    int zp;
    int age;

    //2 задание, конструктор
    public Сотрудники(String fio, int zp, int age) {
        this.fio = fio;
        this.zp = zp;
        this.age = age;
    }
    //Не поняла вот этот момент, сделала по интернету, 3 задание
    public String toString(){
        return String.format("ФИО:%s, зарплата: %d, возраст: %d",
                fio, zp, age);}
    }

