package bookbazaar;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    private static int idCounter = 1;
    private final int id;
    private BookCategory category;
    private LocalDate listingDate;
    private int stock;
    private LocalDate stockUpdateDate;
    private LocalDate lastSellDate;
    private String author;
    private double price;
    private double discount;

    public Book(BookCategory category, int stock, String author, double price) {
        this.id = idCounter++;
        this.category = category;
        this.listingDate = LocalDate.now();
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
        this.lastSellDate = null;
        this.author = author;
        this.price = price;
        this.discount = 0.0;
    }

    public int getId() { return id; }
    public BookCategory getCategory() { return category; }
    public LocalDate getListingDate() { return listingDate; }
    public int getStock() { return stock; }
    public LocalDate getStockUpdateDate() { return stockUpdateDate; }
    public LocalDate getLastSellDate() { return lastSellDate; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock cannot be negative");
        this.stock = stock;
        this.stockUpdateDate = LocalDate.now();
    }

    public void setLastSellDate(LocalDate lastSellDate) {
        this.lastSellDate = lastSellDate;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    public void setDiscount(double discount) {
        if (discount < 0 || discount > 100) throw new IllegalArgumentException("Discount must be between 0 and 100");
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Category: %s | Author: %s | Price: %.2f | Discount: %.2f%% | Stock: %d | Listed: %s | Last Sold: %s | Stock Updated: %s",
                id, category, author, price, discount, stock, listingDate,
                lastSellDate == null ? "Never" : lastSellDate.toString(),
                stockUpdateDate);
    }
}
