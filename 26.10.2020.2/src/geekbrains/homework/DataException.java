package geekbrains.homework;

public class DataException extends RuntimeException {
   int i,j;
   public DataException (int i, int j) {
       super ("Неправильно в строке: "+i+" в столбце: "+j);
       this.i = i;
       this.j = j;
   }
}
