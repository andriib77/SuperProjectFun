package Jenia.airtraffic;

import java.util.ArrayList;
import java.util.List;

public class FlightScheduleSystem {
    private List<Flight> flights;

    public FlightScheduleSystem() {
        this.flights = new ArrayList<>();
    }

    public List<Flight> getFlight() {
        return flights;
    }

    public void setFlight(List<Flight> flight) {
        this.flights = flight;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void updateFlight(Flight flight) {
        // TODO: Implement logic to update flight information
    }

    public List<Flight> getAllFlights() {
        return new ArrayList<>(flights);
    }

    public void handleDelays() {
        for (Flight flight : flights) {
            if (flight.isDelayed()) {
                System.out.println("Рейс " + flight.getFlightNumber() + " задержан.");
            }
        }
    }

    public void handleCancellations() {
        for (Flight flight : flights) {
            if (flight.isCancelled()) {
                System.out.println("Рейс " + flight.getFlightNumber() + " отменен.");
            }
        }
    }
}