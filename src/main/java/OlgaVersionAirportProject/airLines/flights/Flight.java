package OlgaVersionAirportProject.airLines.flights;

import Airport.OlgaVersionAirportProject.airLines.airCrafts.Aircraft;

import java.time.LocalDateTime;

public class Flight {
    private String flightNumber;
    private String countryOfDeparture;
    private String localityOfDeparture;
    private String departureAirport;
    private String countryOfArrival;
    private String localityOfArrival;
    private String arrivalAirport;

    LocalDateTime departureDateTime =LocalDateTime.of(2023,1,1,12,00);
    LocalDateTime arrivalDateTime =LocalDateTime.of(2023,1,1,12,00);

    String aircraft;
    private String idOfAirLine;
    private TypeOfFlights typeOfFlights;

    private int businessSeats;
    private int comfortSeats;
    private int economySeats;

    public Flight(String flightNumber, String countryOfDeparture, String localityOfDeparture, String departureAirport,
                  String countryOfArrival, String localityOfArrival, String arrivalAirport,
                  LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, String aircraft, String idOfAirLine,
                  TypeOfFlights typeOfFlights, int businessSeats, int comfortSeats, int economySeats) {
        this.flightNumber = flightNumber;
        this.countryOfDeparture = countryOfDeparture;
        this.localityOfDeparture = localityOfDeparture;
        this.departureAirport = departureAirport;
        this.countryOfArrival = countryOfArrival;
        this.localityOfArrival = localityOfArrival;
        this.arrivalAirport = arrivalAirport;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.aircraft = aircraft;
        this.idOfAirLine = idOfAirLine;
        this.typeOfFlights = typeOfFlights;
        this.businessSeats = businessSeats;
        this.comfortSeats = comfortSeats;
        this.economySeats = economySeats;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCountryOfDeparture() {
        return countryOfDeparture;
    }

    public void setCountryOfDeparture(String countryOfDeparture) {
        this.countryOfDeparture = countryOfDeparture;
    }

    public String getLocalityOfDeparture() {
        return localityOfDeparture;
    }

    public void setLocalityOfDeparture(String localityOfDeparture) {
        this.localityOfDeparture = localityOfDeparture;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getCountryOfArrival() {
        return countryOfArrival;
    }

    public void setCountryOfArrival(String countryOfArrival) {
        this.countryOfArrival = countryOfArrival;
    }

    public String getLocalityOfArrival() {
        return localityOfArrival;
    }

    public void setLocalityOfArrival(String localityOfArrival) {
        this.localityOfArrival = localityOfArrival;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getIdOfAirLine() {
        return idOfAirLine;
    }

    public void setIdOfAirLine(String idOfAirLine) {
        this.idOfAirLine = idOfAirLine;
    }

    public TypeOfFlights getTypeOfFlights() {
        return typeOfFlights;
    }

    public void setTypeOfFlights(TypeOfFlights typeOfFlights) {
        this.typeOfFlights = typeOfFlights;
    }

    public int getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(int businessSeats) {
        this.businessSeats = businessSeats;
    }

    public int getComfortSeats() {
        return comfortSeats;
    }

    public void setComfortSeats(int comfortSeats) {
        this.comfortSeats = comfortSeats;
    }

    public int getEconomySeats() {
        return economySeats;
    }

    public void setEconomySeats(int economySeats) {
        this.economySeats = economySeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", countryOfDeparture='" + countryOfDeparture + '\'' +
                ", localityOfDeparture='" + localityOfDeparture + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", countryOfArrival='" + countryOfArrival + '\'' +
                ", localityOfArrival='" + localityOfArrival + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureDateTime=" + departureDateTime +
                ", arrivalDateTime=" + arrivalDateTime +
                ", aircraft='" + aircraft + '\'' +
                ", idOfAirLine='" + idOfAirLine + '\'' +
                ", typeOfFlights=" + typeOfFlights +
                ", businessSeats=" + businessSeats +
                ", comfortSeats=" + comfortSeats +
                ", economySeats=" + economySeats +
                '}';
    }
}
