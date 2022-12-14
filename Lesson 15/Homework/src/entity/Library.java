package entity;

import entity.Book;
import entity.Reader;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;


    public Library(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                '}';
    }
}
