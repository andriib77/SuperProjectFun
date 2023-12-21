package AndriiVersionAirportProject.booking;

public class Flight {
    private String flightNumber;
    private String date;
    private String destination;
    private ClassOfService classOfService;
    private boolean isAvailable;

    public Flight(String flightNumber, String date, String destination, ClassOfService classOfService) {
        this.flightNumber = flightNumber;
        this.date = date;
        this.destination = destination;
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
                ", isAvailable=" + isAvailable +
                '}';
    }

}
