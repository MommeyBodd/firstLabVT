package by.bsuir.yaremchuk.task16.comparators;

import by.bsuir.yaremchuk.task12.book.Book;

import java.util.Comparator;

public class AuthorThenTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        if (result != 0) return result;

        result = o1.getTitle().compareTo(o2.getTitle());
        return result;
    }
}
