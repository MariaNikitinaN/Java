package geekbrains.homework;

public abstract class running_track implements jumpble{
    public void length( int length ){
        length = 15;
        System.out.println("");
    }
    @Override
    public void run() {
        System.out.println("man runs");
        System.out.println("cat runs");
        System.out.println("robot runs");

    }
}
