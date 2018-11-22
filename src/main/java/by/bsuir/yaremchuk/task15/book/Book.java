package by.bsuir.yaremchuk.task15.book;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private int isbn;
    private static int edition;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book anotherBook) {
        return Long.compare(this.isbn, anotherBook.isbn);
    }
}