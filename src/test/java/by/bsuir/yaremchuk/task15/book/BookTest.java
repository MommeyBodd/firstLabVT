package by.bsuir.yaremchuk.task15.book;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void shouldReturnOneWhenFirstBookHasGreaterISBN() {
        Book book = new Book("Java", "Bloch", 100, 2500);
        Book anotherBook = new Book("Java", "Schildt", 180, 1500);

        int actual = book.compareTo(anotherBook);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMinusOneWhenFirstBookHasLessISBN() {
        Book book = new Book("Effective Java", "Bloch", 100, 2500);
        Book anotherBook = new Book("Java", "Schildt", 180, 3500);

        int actual = book.compareTo(anotherBook);
        int expected = -1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroWhenBooksHasEqualISBN() {
        Book book = new Book("Effective Java", "Bloch", 100, 2500);
        Book anotherBook = new Book("Effective Java", "Bloch", 100, 2500);

        int actual = book.compareTo(anotherBook);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}