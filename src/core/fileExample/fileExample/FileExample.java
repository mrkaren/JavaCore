package core.fileExample.fileExample;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String path = "/Users/karen/data/lessons/java2021/javacore/src/fileExample/testFolder/example4";
        File file = new File(path);
        File newFile = new File("/Users/karen/data/lessons/java2021/javacore/src/fileExample/testFolder/example8");
        file.renameTo(newFile);
//        System.out.println(file.isDirectory());
//        System.out.println(file.exists());
//        System.out.println(file.canRead());
//        long modified = file.lastModified();
//        System.out.println(new Date(modified));

//        if (!file.exists()) {
//            file.mkdirs();
//        }
//        if(!file.exists()){
//            if (file.createNewFile()) {
//                System.out.println("File is created!");
//            }
//        }
//        System.out.println(file.exists());
//        if (file.exists()) {
//            file.delete();
//        }
//        System.out.println(file.exists());

//        File[] files = file.listFiles();
//        for (File singleFile : files) {
//            String name = singleFile.getName();
//            if (!singleFile.isHidden() && name.contains(".")) {
//                String[] split = name.split("\\.");
//                System.out.println(split[split.length - 1]);
//            }
//        }


    }

}
