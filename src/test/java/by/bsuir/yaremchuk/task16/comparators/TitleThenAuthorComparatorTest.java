package by.bsuir.yaremchuk.task16.comparators;

import by.bsuir.yaremchuk.task12.book.Book;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TitleThenAuthorComparatorTest {

    @Test
    public void shouldReturnPositiveValueWhenInputBookHasLesserAuthor() {
        Book book = new Book("Thinking In Java", "Eckel", 100);
        Book anotherBook = new Book("HeadFirst Java", "Schildt", 180);
        TitleThenAuthorComparator comparator = new TitleThenAuthorComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnNegativeValueWhenInputBookWithGreaterAuthor() {
        Book book = new Book("HeadFirst Java", "Schi", 100);
        Book anotherBook = new Book("Java Core", "Cornell", 180);
        TitleThenAuthorComparator comparator = new TitleThenAuthorComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnPositiveValueWhenInputBookWithEqualAuthorGreaterTitle() {
        Book book = new Book("HeadFirst Java", "Sedgewick", 100);
        Book anotherBook = new Book("Algorithms in Java", "Sedgewick", 180);
        TitleThenAuthorComparator comparator = new TitleThenAuthorComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnZeroWhenInputBookWithEqualAuthorEqualTitle() {
        Book book = new Book("Algorithms in Java", "Sedgewick", 100);
        Book anotherBook = new Book("Algorithms in Java", "Sedgewick", 100);
        TitleThenAuthorComparator comparator = new TitleThenAuthorComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertEquals(0, actual);
    }
}