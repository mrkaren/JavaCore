package core.homework.author.storage;

import core.homework.author.exception.BookNotFoundException;
import core.homework.author.model.Author;
import core.homework.author.model.Book;
import core.homework.author.util.FileUtil;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class BookStorage {

    private List<Book> books = new LinkedList<>();

    public void add(Book book) {
        books.add(book);
        serialize();
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book);
        }

//        Iterator<Book> iterator = books.iterator();
//        while (iterator.hasNext()){
//            Book book = iterator.next();
//            System.out.println(book);
//        }
    }

    public Book getBySerialId(String serialId) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getSerialId().equals(serialId)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book does not exists. serialId: " + serialId);
    }

    public void searchByTitle(String keyword) {
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                System.out.println(book);
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                System.out.println(book);
            }
        }
    }

    public void countByAuthor(Author author) {
        int count = 0;
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                count++;
            }
        }
        System.out.println("count of " + author.getEmail() + " author's book is " + count);
    }

    public void delete(Book book) {
        books.remove(book);
        serialize();
    }


    public void deleteByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthors().contains(author)) {
                books.remove(book);
            }
        }
        serialize();
    }

    public void initData() {
        List<Book> bookList = FileUtil.deserializeBooks();
        if (bookList != null) {
            books = bookList;
        }
    }

    public void serialize() {
        FileUtil.serializeBooks(books);
    }
}
