package geekbrains.homework;

public class SizeException  extends RuntimeException{
    int row,col;
    public SizeException (int row, int col) {
        super ("Столбцов и строк может быть только 4!");
        this.row = row;
        this.col = col;
    }
}
