package flights;

public class FlightSearcher {

    public static void main(String[] args) {

        FlightsRetriever retriever = new FlightsRetriever();
        FlightProcessor flightsProcessor = new FlightProcessor(retriever.retrieve());

        System.out.println(flightsProcessor.findFlightFrom(City.WARSAW));
        System.out.println();
        System.out.println(flightsProcessor.findFlightTo(City.WARSAW));
        System.out.println();
        System.out.println(flightsProcessor.findConnectingFlights(City.GDANSK,City.WROCLAW));

    }
}
