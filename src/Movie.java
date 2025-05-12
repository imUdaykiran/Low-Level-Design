public class Movie {
    private final String name;
    private final String id;
    private final int durationInMinutes;

    public Movie(String name, String id, int durationInMinutes) {
        this.name = name;
        this.id = id;
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
