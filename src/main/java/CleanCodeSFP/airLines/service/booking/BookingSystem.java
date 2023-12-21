package CleanCodeSFP.airLines.service.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private List<Flight> flights;

    public BookingSystem() {

        flights = new ArrayList<>();
        // Initialize flights
        flights.add(new Flight("F001", "2023-12-01", "New York",190, ClassOfService.ECONOMY));
        flights.add(new Flight("F002", "2023-12-02", "London",54, ClassOfService.BUSINESS));
        flights.add(new Flight("F003", "2023-12-03", "Tokyo",8, ClassOfService.FIRST_CLASS));
    }


    public List<Flight> searchFlights(String date, String destination, ClassOfService classOfService) {
        List<Flight> matchingFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getDate().equals(date)
                    && flight.getDestination().equals(destination)
                    && flight.getClassOfService() == classOfService
                    && flight.isAvailable()) {
                matchingFlights.add(flight);
            }
        }
        return matchingFlights;
    }

    /*public void availableFlights() {
        System.out.print(flights);
    }*/

    public boolean bookFlight(Flight flight, Passenger passenger) {
        if (flight != null && passenger != null && flight.isAvailable()) {
            flight.setAvailable(false);
            System.out.println("Flight " + flight.getFlightNumber() + " booked for " + passenger.getName());
            return true;
        } else {
            System.out.println("Flight booking failed.");
            return false;
        }
    }

    public boolean makePayment(Passenger passenger, double amount) {
        // Implement payment logic here
        System.out.println("Payment of $" + amount + " successful for passenger " + passenger.getName());
        return true;
    }

}
