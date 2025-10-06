package JavaExam;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Movie {
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    private final int id;
    private String title;
    private Genre genre;
    private int releaseYear;
    private LocalDate addedDate;
    private AvailabilityStatus availabilityStatus;
    private double price;
    private double discount;
    private LocalDate lastWatchedDate;

    public Movie(String title, Genre genre, int releaseYear, LocalDate addedDate, AvailabilityStatus availabilityStatus, double price) {
        this.id = idGenerator.getAndIncrement();
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.addedDate = addedDate;
        this.availabilityStatus = availabilityStatus;
        this.price = price;
        this.discount = 0.0;
        this.lastWatchedDate = null;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Genre getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public LocalDate getAddedDate() { return addedDate; }
    public AvailabilityStatus getAvailabilityStatus() { return availabilityStatus; }
    public double getPrice() { return price; }
    public double getDiscount() { return discount; }
    public LocalDate getLastWatchedDate() { return lastWatchedDate; }

    public void setTitle(String title) { this.title = title; }
    public void setGenre(Genre genre) { this.genre = genre; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
    public void setAddedDate(LocalDate addedDate) { this.addedDate = addedDate; }
    public void setAvailabilityStatus(AvailabilityStatus status) { this.availabilityStatus = status; }
    public void setPrice(double price) { this.price = price; }
    public void setDiscount(double discount) { this.discount = discount; }
    public void setLastWatchedDate(LocalDate lastWatchedDate) { this.lastWatchedDate = lastWatchedDate; }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", releaseYear=" + releaseYear +
                ", addedDate=" + addedDate +
                ", availabilityStatus=" + availabilityStatus +
                ", price=" + price +
                ", discount=" + discount +
                ", lastWatchedDate=" + lastWatchedDate +
                '}';
    }
}