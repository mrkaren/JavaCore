package core.fileExample.ioExample;

import java.io.File;
import java.io.IOException;

public class IOExample {

    public static void main(String[] args) {
        File file = new File("D:\\store\\1.txt");

        if (!file.exists() && file.isDirectory()) {
            if (file.mkdir()) {
                System.out.println("folder created!");
            }
        }

        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.exists());
//        System.out.println(file.getName());
//        System.out.println(file.canWrite());
//        System.out.println(file.length());
//        System.out.println(file.delete());
//        System.out.println(file.exists());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println(file1.getName() + " " + file1.length());
            }
        }
//        System.out.println(file.mkdirs());
//        System.out.println(file.exists());


    }

}
