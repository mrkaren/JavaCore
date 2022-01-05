package core.homework.author.model;

import java.io.Serializable;
import java.util.Set;

public class Book implements Serializable {

    private String serialId;
    private String title;
    private String description;
    private double price;
    private int count;
    private Set<Author> authors;
    private Set<String> tags;

    public Book(String serialId, String title, String description, double price, int count, Set<Author> authors) {
        this.serialId = serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.authors = authors;
    }

    public Book(String serialId, String title, String description, double price, int count, Set<Author> authors, Set<String> tags) {
        this.serialId = serialId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.authors = authors;
        this.tags = tags;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (count != book.count) return false;
        if (serialId != null ? !serialId.equals(book.serialId) : book.serialId != null) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        if (authors != null ? !authors.equals(book.authors) : book.authors != null) return false;
        return tags != null ? tags.equals(book.tags) : book.tags == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serialId != null ? serialId.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + count;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "serialId='" + serialId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", authors=" + authors +
                ", tags=" + tags +
                '}';
    }
}
