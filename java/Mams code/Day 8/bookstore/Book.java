package bookstore;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private String id;
    private String title;
    private String author;
    private Category category;
    private double price;
    private int stock;
    private LocalDate stockUpdateDate;
    private String publisher;
    private double discount;

    public Book(String id, String title, String author, Category category, double price, int stock, LocalDate stockUpdateDate, String publisher) {
        if (id == null || !id.matches("\\d{3}-\\d-\\d{2}-\\d{6}-\\d")) {
            throw new IllegalArgumentException("Invalid ID format. Expected format: 978-3-16-148410-0");
        }
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative");
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.stockUpdateDate = stockUpdateDate;
        this.publisher = publisher;
        this.discount = 0.0;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public Category getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public LocalDate getStockUpdateDate() { return stockUpdateDate; }
    public String getPublisher() { return publisher; }
    public double getDiscount() { return discount; }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative");
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
    }
    public void setDiscount(double discount) {
        if (discount < 0 || discount > 100) throw new IllegalArgumentException("Discount must be between 0 and 100");
        this.discount = discount;
    }
    public void setStockUpdateDate(LocalDate date) {
        this.stockUpdateDate = date;
    }
    @Override
    public String toString() {
        return String.format("ID: %s | Title: %s | Author: %s | Category: %s | Price: %.2f | Stock: %d | Last Updated: %s | Publisher: %s | Discount: %.2f%%", id, title, author, category, price, stock, stockUpdateDate, publisher, discount);
    }
}
