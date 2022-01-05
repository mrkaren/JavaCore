package core.lesson19;

import core.fileExample.fileExample.serialization.Student;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
//        Map<String, Student> studentMap = new HashMap<>();
//
//        Student student = new Student("poxos", "poxosyan", 12, "poxos@mail.com");
//
//        studentMap.put("poxos@mail.com", student);
//
//        Set<String> strings = studentMap.keySet();
//
//

        Map<String, Integer> map = new TreeMap<>();
        map.put("poxos@mail.com", 12);
        map.put("arto@mail.com", 44);
        map.put("zhirair@mail.com", 23);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

}
