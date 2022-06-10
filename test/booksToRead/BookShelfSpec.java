package booksToRead;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookShelfSpec {

    @Test
    public void shelfEmptyWhenNoBookAddedTest(){
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "Bookshelf is empty");
    }

    @Test
    public void bookShelfContainsTwoBooksWhenTwoBooksAreAdded(){
        BookShelf shelf = new BookShelf();
        shelf.add("Code Complete");
        shelf.add("Effective Java");
        List<String> books = shelf.books();
        assertEquals(2, books.size(), () -> "Bookshelf must have two books");
    }
}
