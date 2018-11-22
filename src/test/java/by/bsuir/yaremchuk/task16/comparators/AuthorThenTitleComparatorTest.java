package by.bsuir.yaremchuk.task16.comparators;

import by.bsuir.yaremchuk.task12.book.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AuthorThenTitleComparatorTest {


    @Test
    public void compare_bookWithLesserAuthor_NegativeIntegerReturned() {
        Book book = new Book("Thinking In Java", "Eckel", 100);
        Book anotherBook = new Book("Java", "Schildt", 180);
        AuthorThenTitleComparator comparator = new AuthorThenTitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void compare_bookWithGreaterAuthor_PositiveIntegerReturned() {
        Book book = new Book("Thinking In Java", "Eckel", 100);
        Book anotherBook = new Book("Java Core", "Cornell", 180);
        AuthorThenTitleComparator comparator = new AuthorThenTitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual > 0);
    }

    @Test
    public void compare_bookWithEqualAuthorGreaterTitle_NegativeIntegerReturned() {
        Book book = new Book("Algorithms in Java", "Sedgewick", 100);
        Book anotherBook = new Book("Computer Science", "Sedgewick", 180);
        AuthorThenTitleComparator comparator = new AuthorThenTitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertTrue(actual < 0);
    }

    @Test
    public void compare_bookWithEqualAuthorEqualTitle_ZeroReturned() {
        Book book = new Book("Algorithms in Java", "Sedgewick", 100);
        Book anotherBook = new Book("Algorithms in Java", "Sedgewick", 100);
        AuthorThenTitleComparator comparator = new AuthorThenTitleComparator();

        int actual = comparator.compare(book, anotherBook);

        Assert.assertEquals(0, actual);
    }

    @Test
    public void sort_booksList_CorrectAnswerReturned() {
        ArrayList<Book> sourceList = new ArrayList<>(Arrays.asList(
                new Book("Algorithms in Java", "Sedgewick", 100),
                new Book("Computer Science", "Sedgewick", 180),
                new Book("Thinking In Java", "Eckel", 100),
                new Book("Java Core", "Cornell", 180)
        ));

        ArrayList<Book> expected = new ArrayList<>(Arrays.asList(
                new Book("Java Core", "Cornell", 180),
                new Book("Thinking In Java", "Eckel", 100),
                new Book("Algorithms in Java", "Sedgewick", 100),
                new Book("Computer Science", "Sedgewick", 180)
        ));

        sourceList.sort(new AuthorThenTitleComparator());

        Assert.assertEquals(expected, sourceList);
    }
}