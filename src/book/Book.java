package book;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;

    public Book(String bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
