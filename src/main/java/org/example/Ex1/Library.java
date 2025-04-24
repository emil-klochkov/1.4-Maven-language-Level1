package org.example.Ex1;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
        sortBooks();
    }

    public void addBookAtPosition(String title, int position) {
        if (position >= 0 && position <= books.size()) {
            books.add(position, new Book(title));
            sortBooks();
        }
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public String getTitleByPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position).getTitle();
        }
        return null;
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    private void sortBooks() {
        books.sort(Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));
    }
}