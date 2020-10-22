package geekbrains.homework;

public class man implements jumpble {
    private String name;
    private int length;
    private int height;
    public man(String name, int length, int height) {
     this.name = name;
        this.length = length;
        this.height = height;
    }

    @Override
    public void jump() {
    System.out.println("man "+name+" jumps");
    }

    @Override
    public void run() {
        System.out.println("man "+name+ " runs");
    }
}
