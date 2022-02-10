package flights;

public class Flight {

    private final City from;
    private final City to;

    public Flight(City from, City to) {
        this.from = from;
        this.to = to;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (from != flight.from) return false;
        return to == flight.to;
    }

    @Override
    public int hashCode() {
        int result = from != null ? from.hashCode() : 0;
        result = 31 * result + (to != null ? to.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
