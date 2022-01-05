package core.homework.author.storage;

import core.homework.author.model.Author;
import core.homework.author.util.FileUtil;

import java.util.ArrayList;
import java.util.List;

public class AuthorStorage {

    private List<Author> authors = new ArrayList<>();

    public void add(Author author) {
        authors.add(author);
        serialize();
    }

    public void print() {
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    public void searchByName(String keyword) {
        for (Author author : authors) {
            if (author.getName().contains(keyword) ||
                    author.getSurname().contains(keyword)) {
                System.out.println(author);
            }
        }

    }

    public void searchByAge(int minAge, int maxAge) {
        for (Author author : authors) {
            if (author.getAge() >= minAge &&
                    author.getAge() <= maxAge) {
                System.out.println(author);
            }
        }
    }

    public Author getByEmail(String email) {
        for (Author author : authors) {
            if (author.getEmail().equals(email)) {
                return author;
            }
        }
        return null;
    }


    public void delete(Author author) {
        authors.remove(author);
        serialize();
    }

    public void initData() {
        List<Author> authorList = FileUtil.deserializeAuthors();
        if (authorList != null) {
            authors = authorList;
        }
    }

    public void serialize() {
        FileUtil.serializeAuthors(authors);
    }
}
