package Jenia.airtraffic;

public class Flight {
    private String flightNumber;
    private String departureCity;
    private String destinationCity;
    private boolean delayed;
    private boolean cancelled;
    private Aircraft aircraft;

    public Flight(String flightNumber, String departureCity, String destinationCity,
                  boolean delayed, boolean cancelled, Aircraft aircraft) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.delayed = delayed;
        this.cancelled = cancelled;
        this.aircraft = aircraft;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    @Override
    public String toString() {
        return "Рейс{" +
                "Номер рейса='" + flightNumber + '\'' +
                ", Город отправления='" + departureCity + '\'' +
                ", Город назначения='" + destinationCity + '\'' +
                ", Задержан=" + delayed +
                ", Отменен=" + cancelled +
                ", Информация о самолете=" + aircraft +
                '}';
    }
}