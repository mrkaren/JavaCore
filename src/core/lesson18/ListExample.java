package core.lesson18;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        String s = names.get(2);
        names.remove(0);
        for (int i = 0; i < 10000; i++) {
            names.add("anun" + i);
        }

        print(names);
    }

    static void print(List<?> list) {
        for (Object s : list) {
            System.out.println(s);
        }
    }

}
