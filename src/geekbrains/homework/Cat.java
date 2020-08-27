package geekbrains.homework;

public class Cat extends Animal{

   public Cat (String name, String color, int age, float MAXheight, float MAXlength, float MAXlength1) {
super(name, color, age, MAXheight, MAXlength, MAXlength1);
   }
        public void jump () {
            System.out.print(name + " прыгает на "+ 2 +" метр");
        }
        public void run () {
            System.out.print(name+" бегает на "+ 200 +" метров");
        }
        public void swim () {
            System.out.print(name+" не плавает");
        }
    }
