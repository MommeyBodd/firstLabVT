package by.bsuir.yaremchuk.task14.book;

public class Book implements Cloneable {

    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book book = null;

        book = (Book)super.clone();

        if (this.author != null) {
            book.author = this.author;
        }
        if (this.title != null) {
            book.title = this.title;
        }
        book.price = this.price;

        return book;
    }
}
