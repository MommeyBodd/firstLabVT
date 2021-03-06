package by.bsuir.yaremchuk.task12.book;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book)obj;
        if (price != book.price) {
            return false;
        }
        if (author == null) {
            return (author == book.author);
        } else {
            if (!author.equals(book.author)) {
                return false;
            }
        }
        if (title == null) {
            return (title == book.title);
        } else {
            if (!title.equals(book.title)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 31 * price +
                ((author == null) ? 0 : author.hashCode()) +
                ((title == null) ? 0 : title.hashCode());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title = " + title +
                "author = " + author +
                "price = " + price +
                "edition = " + edition +
                "}";
    }
}
