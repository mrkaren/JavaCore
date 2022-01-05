package core.homework.author.util;

import core.homework.author.model.Author;
import core.homework.author.model.Book;
import core.homework.author.model.User;

import java.io.*;
import java.util.List;
import java.util.Map;

public class FileUtil {

    private static final String DATA_PATH = "/Users/karen/data/lessons/Java2021New/JavaCore/src/core/homework/author/data";

    public static void serializeAuthors(List<Author> authorList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "/authors.dat"))) {
            out.writeObject(authorList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeBooks(List<Book> bookList) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "/books.dat"))) {
            out.writeObject(bookList);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void serializeUserMap(Map<String, User> userMap) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH + "/users.dat"))) {
            out.writeObject(userMap);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static List<Author> deserializeAuthors() {
        File authorFile = new File(DATA_PATH + "/authors.dat");
        if (!authorFile.exists()) {
            try {
                authorFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(authorFile))) {
                Object obj = in.readObject();
                return (List<Author>) obj;
            } catch (EOFException e){

            }
            catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static List<Book> deserializeBooks() {
        File bookFile = new File(DATA_PATH + "/books.dat");
        if (!bookFile.exists()) {
            try {
                bookFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(bookFile))) {
                Object obj = in.readObject();
                return (List<Book>) obj;
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static Map<String, User> deserializeUserMap() {
        File userFile = new File(DATA_PATH + "/users.dat");
        if (!userFile.exists()) {
            try {
                userFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(userFile))) {
                Object obj = in.readObject();
                return (Map<String, User>) obj;
            } catch (EOFException e) {

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
