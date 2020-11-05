package geekbrains.homework;

public class cat implements jumpble {
    private String name;
    private int length;
    private int height;
    public cat(String name, int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }
        @Override
    public void jump() {
        System.out.println("cat "+name+" jumps");
    }

    @Override
    public void run() {
        System.out.println("cat "+name +" runs");


    }
}
