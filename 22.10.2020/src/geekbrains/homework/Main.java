package geekbrains.homework;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        jumpble cat = new cat("Baks",15,20);
        jumpble man = new man("Vasily",14,5);
        jumpble robot = new robot("Bender",30, 40);

        cat.jump();
        cat.run();

        man.jump();
        man.run();

        robot.jump();
        robot.run();

        System.out.println("Задача 2:");
        cat.jump();
        cat.run();

        man.jump();
        man.run();

        robot.jump();
        robot.run();

        System.out.println("Задача 3:");
        jumpble[] jumpbles = {
                new cat("Barsik", 15, 20),
                new robot("Pasha",30,40),
                new man("Nikolay", 14,5),
        };
        for (jumpble j : jumpbles) {
            j.jump();
            j.run();
        }
    }
}
