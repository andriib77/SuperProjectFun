package AndriiVersionAirportProject.baggage;

public class Bag {
    private String trackingNumber;
    private String baggageType;

    private double weight;
    private boolean isChecked;
    private boolean isLoaded;
    private String destination;
    private String status;
    private boolean isIssued;//baggage direct flight or with transit


    public Bag(String trackingNumber, String destination) {
        this.trackingNumber = trackingNumber;
        this.baggageType = baggageType;
        this.weight = weight;
        this.isChecked = false;
        this.isLoaded = false;
        this.destination = destination;
        this.status = "Not Checked";
        this.isIssued = isIssued;

    }
    //TODO
    /*public Bag(String trackingNumber, String baggageType, double weight, boolean isChecked, boolean isLoaded, String destination, String status, boolean isIssued) {
        this.trackingNumber = trackingNumber;
        this.baggageType = baggageType;
        this.weight = weight;
        this.isChecked = isChecked;
        this.isLoaded = isLoaded;
        this.destination = destination;
        this.status = status;
        this.isIssued = isIssued;
    }*/

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public String getDestination() {
        return destination;
    }

    public String getStatus() {
        return status;
    }

    // Метод для регистрации багажа
    public void checkBag() {
        isChecked = true;
        status = "Checked";
    }

    // Метод для загрузки багажа в самолет
    public void loadBag() {
        isLoaded = true;
        status = "Loaded";
    }

    // Метод для отображения информации о багаже
    @Override
    public String toString() {
        return "Bag{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", isChecked=" + isChecked +
                ", isLoaded=" + isLoaded +
                ", destination='" + destination + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
