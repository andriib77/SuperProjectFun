package CleanCodeSFP.airLines.service.booking;

public class Flight {
    private String flightNumber;
    private String date;
    private String destination;
    private ClassOfService classOfService;
    private int seatsQuantity;
    private boolean isAvailable;

    public Flight(String flightNumber, String date, String destination, int seatsQuantity, ClassOfService classOfService) {
        this.flightNumber = flightNumber;
        this.date = date;
        this.destination = destination;
        this.seatsQuantity = seatsQuantity;
        this.classOfService = classOfService;
        this.isAvailable = true;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(int seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public ClassOfService getClassOfService() {
        return classOfService;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", date='" + date + '\'' +
                ", destination='" + destination + '\'' +
                ", classOfService=" + classOfService +
                ", seatsQuantity=" + seatsQuantity +
                ", isAvailable=" + isAvailable +
                '}';
    }

}
