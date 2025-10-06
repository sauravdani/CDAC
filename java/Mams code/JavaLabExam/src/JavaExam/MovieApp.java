package JavaExam;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class MovieApp {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add new movie");
            System.out.println("2. Update availability status");
            System.out.println("3. Apply 20% discount to movies not watched in last 3 months");
            System.out.println("4. Remove movies added over 2 years ago and never watched");
            System.out.println("5. Set last watched date for a movie");
            System.out.println("6. List all movies");
            System.out.println("7. Clear all movies");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = -1;
            try { choice = Integer.parseInt(sc.nextLine()); } catch (Exception e) {}
            switch (choice) {
                case 1:
                    addMovieUI(manager, sc);
                    break;
                case 2:
                    updateAvailabilityUI(manager, sc);
                    break;
                case 3:
                    manager.applyDiscountToUnwatchedMovies();
                    System.out.println("Discount applied.");
                    break;
                case 4:
                    manager.removeOldUnwatchedMovies();
                    System.out.println("Old, never-watched movies removed.");
                    break;
                case 5:
                    setLastWatchedDateUI(manager, sc);
                    break;
                case 6:
                    for (Movie m : manager.getMovies()) System.out.println(m);
                    break;
                case 7:
                    manager.clearMovies();
                    System.out.println("All movies cleared. Start fresh!");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
        System.out.println("Exiting...");
    }

    private static void updateAvailabilityUI(MovieManager manager, Scanner sc) {
        if (manager.getMovies().isEmpty()) {
            System.out.println("No movies available. Please add movies first.");
            return;
        }
        try {
            System.out.print("Enter movie ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Enter new status (AVAILABLE/UNAVAILABLE): ");
            AvailabilityStatus status = AvailabilityStatus.valueOf(sc.nextLine().trim().toUpperCase());
            boolean updated = manager.updateAvailability(id, status);
            if (updated) System.out.println("Status updated.");
            else System.out.println("Movie not found. Use option 6 to list valid IDs.");
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    private static void setLastWatchedDateUI(MovieManager manager, Scanner sc) {
        if (manager.getMovies().isEmpty()) {
            System.out.println("No movies available. Please add movies first.");
            return;
        }
        try {
            System.out.print("Enter movie ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Movie m = manager.getMovieById(id);
            if (m == null) {
                System.out.println("Movie not found. Use option 6 to list valid IDs.");
                return;
            }
            System.out.print("Enter last watched date (yyyy-MM-dd) or leave blank for never: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                m.setLastWatchedDate(null);
                System.out.println("Last watched date cleared.");
            } else {
                try {
                    LocalDate date = LocalDate.parse(input);
                    m.setLastWatchedDate(date);
                    System.out.println("Last watched date set.");
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    private static void addMovieUI(MovieManager manager, Scanner sc) {
        try {
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter genre (ACTION, DRAMA, COMEDY, HORROR, DOCUMENTARY): ");
            Genre genre = Genre.valueOf(sc.nextLine().trim().toUpperCase());
            System.out.print("Enter release year: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.print("Enter price (INR): ");
            double price = Double.parseDouble(sc.nextLine());
            LocalDate addedDate = LocalDate.now();
            System.out.print("Enter availability (AVAILABLE/UNAVAILABLE): ");
            AvailabilityStatus status = AvailabilityStatus.valueOf(sc.nextLine().trim().toUpperCase());
            Movie m = new Movie(title, genre, year, addedDate, status, price);
            manager.addMovie(m);
            System.out.println("Movie added: " + m);
            System.out.println("Movie ID: " + m.getId());
        } catch (Exception e) {
            System.out.println("Invalid input. Movie not added.");
        }
    }
}