package Jenia.booking;

public class Flight {
    private final String flightNumber;
    private final String destination;
    private final String departureTime;
    private final String arrivalTime;
    private boolean isDelayed;
    private boolean isCancelled;

    public Flight(String flightNumber, String destination, String departureTime,String arrivalTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.isDelayed = false;
        this.isCancelled = false;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public boolean isDelayed() {
        return isDelayed;
    }

    public void setDelayed(boolean delayed) {
        isDelayed = delayed;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
    // Метод для задержки рейса
    public void delayFlight() {
        isDelayed = true;
    }

    // Метод для отмены рейса
    public void cancelFlight() {
        isCancelled = true;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", isDelayed=" + isDelayed +
                ", isCancelled=" + isCancelled +
                '}';
    }
}
