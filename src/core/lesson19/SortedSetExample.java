package core.lesson19;

import java.util.*;

public class SortedSetExample {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("poxos", "poxosyan",12, "poxos@mail.com");
        Student student2 = new Student("poxos", "poxosyan",12, "poxos@mail.com");
        Student student1 = new Student("arto", "poxosyan",14, "arto@mail.com");
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                return -1;
            }
        });


        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
