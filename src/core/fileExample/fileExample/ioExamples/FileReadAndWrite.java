package core.fileExample.fileExample.ioExamples;

import java.io.*;

public class FileReadAndWrite {

    private static final String FILE_PATH = "/Users/karen/data/lessons/Java2021New/JavaCore/src/core/fileExample/fileExample/ioExamples/file/example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
    }


    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H e llo From JAVA \r\n");
            bw.write("Hello From JAVA line 2!!!!!!!!!!!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
