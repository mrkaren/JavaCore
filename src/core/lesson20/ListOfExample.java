package core.lesson20;

import java.util.*;

public class ListOfExample {

    public static void main(String[] args) {
        Set<String> invalidNames =
                Set.of("poxos", "petros", "martiros", "poxosik");

        String name = "poxos";

        Set<String> invalidNameSet = new HashSet<>(invalidNames);

        Map<String, String> nameMap = new HashMap<>();
        nameMap.putIfAbsent("poxos", "poxosik");



    }
}
