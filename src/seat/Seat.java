package seat;

public class Seat {
    private final String id;
    private final int row;
    private final int column;
    private final SeatType type;
    private SeatStatus status;
    private final double price;

    public Seat(String id, int row, int column, SeatType type, SeatStatus status, double price) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.type = type;
        this.status = status;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public SeatType getType() {
        return type;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}
