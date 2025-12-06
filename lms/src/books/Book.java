package books;

public class Book {
    public String title;
    public String description;
    public String isbn;
    public String author;
    public int quantity;
    public String publisher;
    public String category;

    public Book(String title, String author, String description, String isbn, String publisher, String category, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.category = category;
        this.quantity = quantity;
        this.description = description;
    }
}