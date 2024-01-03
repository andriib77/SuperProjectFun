package OlgaVersionAirportProject.OlgaVersionAirportProject.airLines.flights;


import OlgaVersionAirportProject.OlgaVersionAirportProject.airLines.airCrafts.Aircraft;

import java.time.LocalDateTime;

public class RegularFlights {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;
    private String idOfAirLine;

    private int businessSeats;
    private int comfortSeats;
    private int economySeats;




    public RegularFlights(String flightNumber, String departureAirport, String arrivalAirport,
                          LocalDateTime departureTime, LocalDateTime arrivalTime, Aircraft aircraft,
                          String idOfAirLine, int businessSeats, int comfortSeats, int economySeats) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.idOfAirLine = idOfAirLine;
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

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getIdOfAirLine() {
        return idOfAirLine;
    }

    public void setIdOfAirLine(String idOfAirLine) {
        this.idOfAirLine = idOfAirLine;
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
        return "RegularFlights{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", aircraft=" + aircraft +
                ", idOfAirLine='" + idOfAirLine + '\'' +
                ", businessSeats=" + businessSeats +
                ", comfort=" + comfortSeats +
                ", economySeats=" + economySeats +
                '}';
    }
}
