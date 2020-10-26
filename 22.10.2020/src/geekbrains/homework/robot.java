package geekbrains.homework;

public class robot implements jumpble {
    private String name;
    private int length;
    private int height;
    public robot(String name,int length, int height) {
        this.name = name;
        this.length = length;
        this.height = height;
    }
        @Override
    public void jump() {
        System.out.println("robot "+name+" jumps");
    }

    @Override
    public void run() {
        System.out.println("robot "+name+" runs");
    }
}
