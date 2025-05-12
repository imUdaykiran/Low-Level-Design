import java.util.List;

public class Theater {
    private final String name;
    private final String id;
    private final String location;
    private final List<Show> shows;

    public Theater(String name, String id, String location, List<Show> shows) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.shows = shows;
    }
}
