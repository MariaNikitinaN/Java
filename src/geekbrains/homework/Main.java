package geekbrains.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
	Cat a = new Cat ("Baks","Grey", 5, 2, 200, 0);
	Dog b = new Dog ("Bobik", "Black", 7, (float) 0.5, 500, 10);

a.jump();
System.out.println();
a.run();
System.out.println();
a.swim();
System.out.println();
b.jump();
System.out.println();
b.run();
System.out.println();
b.swim();

        System.out.println();
System.out.print("Введите значения высоты прыжка: ");
        int height= scanner.nextInt();
System.out.print("Введите значения длины забега: ");
        int length = scanner.nextInt();
System.out.print("Введите значения длины заплыва: ");
        int length1 = scanner.nextInt();

        if (height < b.MAXheight) { System.out.println(b.name+ " прыгнет"); }  else System.out.println(b.name+ " не прыгнет");
            if (height < a.MAXheight) { System.out.println(a.name+ " прыгнет"); } else System.out.println(b.name+ " не прыгнет");
                if (length < b.MAXlength) { System.out.println(b.name+ " пробежит ");} else System.out.println(b.name+ " не пробежит");
                    if (length < a.MAXlength) { System.out.println(a.name+ " пробежит ");} else System.out.println(b.name+ " не пробежит");
                    if (length1 < b.MAXlength1) { System.out.println(b.name+ " проплывет");} else System.out.println(b.name+ " не проплывет");
        System.out.println(a.name+ " не умеет плавать");}

}
