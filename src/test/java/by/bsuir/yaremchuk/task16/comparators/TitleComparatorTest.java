package by.bsuir.yaremchuk.task16.comparators;

import by.bsuir.yaremchuk.task12.book.Book;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TitleComparatorTest {

    @Test
    public void shouldReturnPositiveValueWhenInputBookHasLesserAuthor() {
        Book book = new Book("Java", "Eckel", 100);
        Book anotherBook = new Book("HeadFirst Java", "Schildt", 180);
        TitleComparator comparator = new TitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void shouldReturnNegativeValueWhenInputBookWithGreaterAuthor() {
        Book book = new Book("HeadFirst Java", "Schi", 100);
        Book anotherBook = new Book("Java Core", "Cornell", 180);
        TitleComparator comparator = new TitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnZeroValueWhenInputBookWithEqualTitle() {
        Book book = new Book("HeadFirst Java", "Sedgewick", 100);
        Book anotherBook = new Book("HeadFirst Java", "Sedgewick", 180);
        TitleComparator comparator = new TitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertEquals(0, actual);
    }


}