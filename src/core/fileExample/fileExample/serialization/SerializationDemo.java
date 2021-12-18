package core.fileExample.fileExample.serialization;

import java.io.*;


public class SerializationDemo {

    private static final String FILE_PATH = "/Users/karen/data/lessons/Java2021New/JavaCore/src/core/fileExample/fileExample/serialization/file/example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //for writing student object to file.

//        Student student = new Student("poxos", "poxosyan", 36, "poxos@gmail.com");
//
//        ObjectOutputStream objectOutputStream =
//                new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);

    }

}
