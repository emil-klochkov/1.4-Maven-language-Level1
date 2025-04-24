package org.example.Ex1;

import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testListIsNotNull() {
        assertNotNull(library.getBooks(), "Список не должен быть null");
    }

    @Test
    void testAddBooks() {
        library.addBook("Java");
        library.addBook("Python");
        assertEquals(2, library.getBooks().size());
    }

    @Test
    void testAddBookAtPosition() {
        library.addBook("C++");
        library.addBookAtPosition("Python", 0);
        assertTrue(library.getBooks().get(0).getTitle().equalsIgnoreCase("Python"));
    }

    @Test
    void testRemoveBook() {
        library.addBook("Java");
        library.removeBook("Java");
        assertEquals(0, library.getBooks().size());
    }

    @Test
    void testListIsSorted() {
        library.addBook("Zoo");
        library.addBook("Apple");
        List<Book> books = library.getBooks();
        assertEquals("Apple", books.get(0).getTitle());
    }
}
