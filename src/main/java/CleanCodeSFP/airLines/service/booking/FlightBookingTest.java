package CleanCodeSFP.airLines.service.booking;

import java.util.List;

public class FlightBookingTest {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        // Search for flights
        List<Flight> matchingFlights = bookingSystem.searchFlights("2023-12-01", "New York", ClassOfService.ECONOMY);

        // Book a flight and make payment
        if (!matchingFlights.isEmpty()) {
            Flight selectedFlight = matchingFlights.get(0);
            Passenger passenger = new Passenger("John Doe", "23A");

            if (bookingSystem.bookFlight(selectedFlight, passenger)) {
                double paymentAmount = 200.0; // Replace with the actual payment amount
                if (bookingSystem.makePayment(passenger, paymentAmount)) {
                    System.out.println("Booking and payment successful!");
                } else {
                    System.out.println("Payment failed. Booking canceled.");
                    selectedFlight.setAvailable(true);
                }
            }
        } else {
            System.out.println("No matching flights found.");
        }

    }

}