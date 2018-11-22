package by.bsuir.yaremchuk.task16.comparators;

import by.bsuir.yaremchuk.task12.book.Book;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTitlePriceComparatorTest {

    @Test
    public void shouldReturnNegativeValueWhenInputBookHasLesserAuthor() {
        Book book = new Book("Thinking Java", "Eckel", 100);
        Book anotherBook = new Book("HeadFirst Java", "Schildt", 180);
        AuthorTitlePriceComparator comparator = new AuthorTitlePriceComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnNegativeValueWhenInputBookWithGreaterTitleEqualAuthor() {
        Book book = new Book("HeadFirst Java", "Cornell", 100);
        Book anotherBook = new Book("Java Core", "Cornell", 180);
        AuthorTitlePriceComparator comparator = new AuthorTitlePriceComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void shouldReturnNegativeValueWhenInputBookWithEqualAuthorEqualTitle() {
        Book book = new Book("HeadFirst Java", "Sedgewick", 100);
        Book anotherBook = new Book("HeadFirst Java", "Sedgewick", 180);
        AuthorTitlePriceComparator comparator = new AuthorTitlePriceComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

}