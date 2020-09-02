package geekbrains.homework;

public class Dog extends Animal{

    Dog (String name, String color, int age, float MAXheight, float MAXlength, float MAXlength1) {
        super(name, color, age, MAXheight, MAXlength, MAXlength1);
    }

        public void jump () {
            System.out.print(name +" прыгает на "+ 0.5 +" метров");
        }
        public void run () {
            System.out.print(name + " бегает на "+ 500 +" метров");
        }
        public void swim () {
            System.out.print(name + " плавает на "+ 10 +" метров");
        }
}
