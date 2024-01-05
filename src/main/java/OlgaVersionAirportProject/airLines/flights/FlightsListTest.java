package OlgaVersionAirportProject.airLines.flights;

import java.time.LocalDateTime;

public class FlightsListTest {


    public static void main(String[] args) {


        FlightsListTest flightsListTest = new FlightsListTest();

        //Flight "Lufthansa" to-back
        LocalDateTime departureDateTime1 = LocalDateTime.of(2024, 1, 25, 12, 10);
        LocalDateTime arrivalDateTime1 = LocalDateTime.of(2024, 1, 25, 12, 50);
        String aircraft ="Boeing 777-200ER";

        Flight LufthhansaFlight1 = new Flight("DLH1537", "Germany","Berlin", "BER",
                "Germany", "Munchen", "EDDM",departureDateTime1, arrivalDateTime1, "Boeing 777-200ER",
                "DLH",TypeOfFlights.REGULAR_PASSENGER_FLIGHT, 32, 108,300);


        LocalDateTime departureDateTime2 = LocalDateTime.of(2024, 1, 25, 16, 30);
        LocalDateTime arrivalDateTime2 = LocalDateTime.of(2024, 1, 25, 17, 10);
        aircraft = "Boeing 777-200ER"; //reuse previous aircraft "Boeing 777-200ER"

        Flight LufthhansaFlight2 = new Flight("DLH1538", "Germany","Munchen", "EDDM",
                "Germany", "Berlin", "BER",departureDateTime2, arrivalDateTime2, "Boeing 777-200ER",
                "DLH",TypeOfFlights.REGULAR_PASSENGER_FLIGHT, 32, 108,300);


      /*  //Flight " AZAL" transit to-to-back

        LocalDateTime departureDateTime3 = LocalDateTime.of(2024, 1, 25, 12, 10);
        LocalDateTime arrivalDateTime3 = LocalDateTime.of(2024, 1, 25, 17, 30);
        LocalDateTime departureDateTime3_1 = LocalDateTime.of(2024, 1, 25, 21, 40);
        LocalDateTime arrivalDateTime3_1 = LocalDateTime.of(2024, 1, 26, 02, 50);
        String aircraft1 ="Airbus A320-200";

        Flight AZALFlight1=new Flight()*/

    }

}
