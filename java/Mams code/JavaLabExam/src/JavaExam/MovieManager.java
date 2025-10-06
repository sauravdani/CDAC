package JavaExam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieManager {
    private List<Movie> movies = new ArrayList<>();

   
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    
    public boolean updateAvailability(int movieId, AvailabilityStatus status) {
        for (Movie m : movies) {
            if (m.getId() == movieId) {
                m.setAvailabilityStatus(status);
                return true;
            }
        }
        return false;
    }

    
    public void applyDiscountToUnwatchedMovies() {
        LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
        for (Movie m : movies) {
            LocalDate lastWatched = m.getLastWatchedDate();
            if (lastWatched == null || lastWatched.isBefore(threeMonthsAgo)) {
                m.setDiscount(20.0);
            }
        }
    }

    
    public void removeOldUnwatchedMovies() {
        LocalDate twoYearsAgo = LocalDate.now().minusYears(2);
        Iterator<Movie> it = movies.iterator();
        while (it.hasNext()) {
            Movie m = it.next();
            if (m.getAddedDate().isBefore(twoYearsAgo) && m.getLastWatchedDate() == null) {
                it.remove();
            }
        }
    }

   
    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getMovieById(int id) {
        for (Movie m : movies) {
            if (m.getId() == id) return m;
        }
        return null;
    }
    public void clearMovies() {
        movies.clear();
    }
}