
import seat.Seat;

import java.util.List;

//package booking;
public class Booking {
    private final Show show;
    private final User user;
    private final String id;
    private final List<Seat> seats;
    private final double totalPrice;
    private BookingStatus status;

    public Booking(String id, Show show, User user,  List<Seat> seats, double totalPrice, BookingStatus status) {
        this.show = show;
        this.user = user;
        this.id = id;
        this.seats = seats;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public Show getShow() {
        return show;
    }

    public User getUser() {
        return user;
    }

    public String getId() {
        return id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

}
