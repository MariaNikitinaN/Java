package geekbrains.homework;

import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {
        InputStream in;
        OutputStream out;

        FileOutputStream fos = new FileOutputStream("lala.txt", true);
        int a;
        int b;
        FileOutputStream fics = new FileOutputStream("lala1.txt", true);
        FileOutputStream fos2 = new FileOutputStream("lala2.txt", true);
        FileInputStream fis = new FileInputStream("lala.txt");
        FileInputStream fis1 = new FileInputStream("lala1.txt");
        while ((a = fis.read()) != -1)
            fos2.write(a);
        fos2.write("\n".getBytes());
        while ((b = fis1.read()) != -1)
            fos2.write(b);
        fis.close();
        fis1.close();
        fics.close();
        fos.close();
    }
}
