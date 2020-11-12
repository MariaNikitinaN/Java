package geekbrains.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phone {
    private HashMap<String, Set<String>> phoneBook = new HashMap();

    public Phone() {
    }

    public void add(String name, String phone) {
        Set<String> tell = (Set)this.phoneBook.getOrDefault(name, new HashSet());
        tell.add(phone);
        this.phoneBook.put(name, tell);
    }

    public Set<String> get(String name) {
        return (Set)this.phoneBook.get(name);
    }
}
