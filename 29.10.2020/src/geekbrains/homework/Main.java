package geekbrains.homework;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

            String[] words = new String[]{"hello", "maria", "how", "are", "hello", "lala", "how", "fine", "lala", "maria", "do", "la"};
            System.out.println(Arrays.toString(words));
            HashMap<String, Integer> hmap = new HashMap();
            String[] var3 = words;
            int var4 = words.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                String x = var3[var5];
                hmap.put(x, (Integer)hmap.getOrDefault(x, 0) + 1);
            }

            System.out.println(hmap);
            Phone phBook = new Phone();
            phBook.add("Никитина", "89251743761");
            phBook.add("Матвеева", "89251743762");
            phBook.add("Городничева", "89251743763");
            phBook.add("Полынцова", "89251743764");
            phBook.add("Иванов", "89251743765");
            System.out.println("Тел:" + phBook.get("Никитина"));
            System.out.println("Тел:" + phBook.get("Матвеева"));
        }
    }
