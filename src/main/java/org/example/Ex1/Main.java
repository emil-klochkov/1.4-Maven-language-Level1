package org.example.Ex1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");


        System.out.println("Books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }


        System.out.println("Ex1.Book at position 1: " + library.getTitleByPosition(1));


        library.addBookAtPosition("Python Programming", 1);


        System.out.println("\nBooks after adding 'Python Programming' at position 1:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }


        library.removeBook("Data Structures");


        System.out.println("\nBooks after removing 'Data Structures':");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle());
        }
    }
}