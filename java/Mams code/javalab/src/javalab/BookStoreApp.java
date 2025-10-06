package javalab;



import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class BookStoreApp {
    private static final String FILE_NAME = "inventory.ser";
    private static HashMap<Integer, Book> inventory = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Book Store Inventory Menu ---");
            System.out.println("1. Add New Book");
            System.out.println("2. Update Stock of a Book");
            System.out.println("3. Set Discount for All Books of a Given Category");
            System.out.println("4. Remove Books That Have Not Been in Stock for the Last 6 Months");
            System.out.println("5. Save Inventory to File");
            System.out.println("6. Load Inventory from File");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addNewBook(); break;
                case 2: updateStock(); break;
                case 3: setDiscountByCategory(); break;
                case 4: removeOldStock(); break;
                case 5: saveInventory(); break;
                case 6: loadInventory(); break;
                case 7: displayInventory(); break;
                case 8: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addNewBook() {
        try {
            System.out.print("Enter ID (single digit 0-9): ");
            int id = sc.nextInt();
            sc.nextLine();
            if (id < 0 || id > 9) {
                System.out.println("ID must be a single digit (0-9).");
                return;
            }
            if (inventory.containsKey(id)) {
                System.out.println("Book with this ID already exists.");
                return;
            }
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Category (FICTION, NONFICTION, SCIENCE, HISTORY, TECHNOLOGY): ");
            Category category = Category.valueOf(sc.nextLine().toUpperCase());
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            System.out.print("Publisher: ");
            String publisher = sc.nextLine();
            Book book = new Book(id, title, author, category, price, stock, LocalDate.now(), publisher);
            inventory.put(id, book);
            System.out.println("Book added successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void updateStock() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        Book book = inventory.get(id);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        try {
            System.out.print("Enter new stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            book.setStock(stock);
            System.out.println("Stock updated.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void setDiscountByCategory() {
        try {
            System.out.print("Enter category: ");
            Category category = Category.valueOf(sc.nextLine().toUpperCase());
            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();
            sc.nextLine();
            for (Book book : inventory.values()) {
                if (book.getCategory() == category) {
                    book.setDiscount(discount);
                }
            }
            System.out.println("Discount set for all books in " + category + ".");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void removeOldStock() {
        LocalDate now = LocalDate.now();
        List<Integer> toRemove = new ArrayList<>();
        for (Book book : inventory.values()) {
            if (book.getStock() == 0 && ChronoUnit.MONTHS.between(book.getStockUpdateDate(), now) >= 6) {
                toRemove.add(book.getId());
            }
        }
        for (int id : toRemove) {
            inventory.remove(id);
        }
        System.out.println(toRemove.size() + " books removed.");
    }

    private static void saveInventory() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(inventory);
            System.out.println("Inventory saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    private static void loadInventory() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            inventory = (HashMap<Integer, Book>) ois.readObject();
            System.out.println("Inventory loaded from file.");
        } catch (Exception e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }

    private static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("No books in inventory.");
            return;
        }
        for (Book book : inventory.values()) {
            System.out.println(book);
        }
    }
}