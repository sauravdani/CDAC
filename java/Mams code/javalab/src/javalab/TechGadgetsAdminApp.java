package javalab;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class TechGadgetsAdminApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<Integer, Gadget> gadgets = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- TechGadgets Admin Menu ---");
            System.out.println("1. Add a new Gadget");
            System.out.println("2. Update stock of a Gadget");
            System.out.println("3. Add 25% discount to gadgets not sold in last 6 months");
            System.out.println("4. Remove gadgets listed over a year ago and never sold");
            System.out.println("5. Display all gadgets");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: addGadget(); break;
                case 2: updateStock(); break;
                case 3: applyDiscount(); break;
                case 4: removeOldGadgets(); break;
                case 5: displayGadgets(); break;
                case 6: System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void addGadget() {
        try {
            System.out.print("Enter category (LAPTOP, SMARTPHONE, TABLET): ");
            GadgetCategory category = GadgetCategory.valueOf(sc.nextLine().trim().toUpperCase());
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter brand: ");
            String brand = sc.nextLine().trim();
            System.out.print("Enter price (INR): ");
            double price = sc.nextDouble();
            sc.nextLine();
            Gadget gadget = new Gadget(category, stock, brand, price);
            gadgets.put(gadget.getId(), gadget);
            System.out.println("Gadget added: " + gadget);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void updateStock() {
        try {
            System.out.print("Enter Gadget ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            Gadget gadget = gadgets.get(id);
            if (gadget == null) {
                System.out.println("Gadget not found.");
                return;
            }
            System.out.print("Enter new stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            gadget.setStock(stock);
            System.out.println("Stock updated: " + gadget);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void applyDiscount() {
        LocalDate now = LocalDate.now();
        List<Gadget> discounted = gadgets.values().stream()
            .filter(g -> g.getLastSellDate() == null || ChronoUnit.MONTHS.between(g.getLastSellDate(), now) >= 6)
            .collect(Collectors.toList());
        discounted.forEach(g -> g.setDiscount(25.0));
        System.out.println(discounted.size() + " gadgets received a 25% discount.");
    }

    private static void removeOldGadgets() {
        LocalDate now = LocalDate.now();
        List<Integer> toRemove = gadgets.values().stream()
            .filter(g -> g.getLastSellDate() == null && ChronoUnit.YEARS.between(g.getListingDate(), now) >= 1)
            .map(Gadget::getId)
            .collect(Collectors.toList());
        toRemove.forEach(gadgets::remove);
        System.out.println(toRemove.size() + " gadgets removed.");
    }

    private static void displayGadgets() {
        if (gadgets.isEmpty()) {
            System.out.println("No gadgets in inventory.");
            return;
        }
        gadgets.values().forEach(System.out::println);
    }
}
