import seat.Seat;

import java.time.LocalDateTime;
import java.util.Map;

public class Show {
    private final String id;
    private final Movie movie;
    private final Theater theater;
    private final LocalDateTime startTime;
    private final Map<String, Seat> seats;

    public Show(String id, Movie movie, Theater theater, LocalDateTime startTime, Map<String, Seat> seats) {
        this.id = id;
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
        this.seats = seats;
    }

    public String getId() {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public Map<String, Seat> getSeats() {
        return seats;
    }
}
