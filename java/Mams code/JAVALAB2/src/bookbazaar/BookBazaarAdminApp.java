package bookbazaar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class BookBazaarAdminApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<Integer, Book> books = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- BookBazaar Admin Menu ---");
            System.out.println("1. Add a new Book");
            System.out.println("2. Modify price of a Book");
            System.out.println("3. Remove books in stock >1 year with zero sales");
            System.out.println("4. Report: books with low stock (<5 units)");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addBook(); break;
                case 2: modifyPrice(); break;
                case 3: removeOldZeroSalesBooks(); break;
                case 4: reportLowStock(); break;
                case 5: displayBooks(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addBook() {
        try {
            System.out.print("Enter category (FICTION, NON_FICTION, EDUCATIONAL): ");
            BookCategory category = BookCategory.valueOf(sc.nextLine().trim().toUpperCase());
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine().trim();
            System.out.print("Enter price (INR): ");
            double price = sc.nextDouble();
            sc.nextLine();
            Book book = new Book(category, stock, author, price);
            books.put(book.getId(), book);
            System.out.println("Book added: " + book);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void modifyPrice() {
        try {
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Book book = books.get(id);
            if (book == null) {
                System.out.println("Book not found.");
                return;
            }
            System.out.print("Enter new price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            book.setPrice(price);
            System.out.println("Price updated: " + book);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void removeOldZeroSalesBooks() {
        LocalDate now = LocalDate.now();
        List<Integer> toRemove = books.values().stream()
            .filter(b -> b.getLastSellDate() == null && ChronoUnit.YEARS.between(b.getListingDate(), now) >= 1)
            .map(Book::getId)
            .collect(Collectors.toList());
        toRemove.forEach(books::remove);
        System.out.println(toRemove.size() + " books removed.");
    }

    private static void reportLowStock() {
        List<Book> lowStock = books.values().stream()
            .filter(b -> b.getStock() < 5)
            .collect(Collectors.toList());
        if (lowStock.isEmpty()) {
            System.out.println("No books with low stock.");
        } else {
            System.out.println("Books with low stock (<5 units):");
            lowStock.forEach(System.out::println);
        }
    }

    private static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in catalog.");
            return;
        }
        books.values().forEach(System.out::println);
    }
}
