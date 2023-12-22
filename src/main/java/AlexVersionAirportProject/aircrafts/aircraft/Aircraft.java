package AlexVersionAirportProject.aircrafts.aircraft;

public class Aircraft {

    private String model;

    private String category;

    private int capacityOfPassengers;

    private double weight;

    private double maxSpeed;

    private double range;

    public Aircraft(String model, String category, int capacityOfPassengers,
                    double weight, double maxSpeed, double range) {
        this.model = model;
        this.category = category;
        this.capacityOfPassengers = capacityOfPassengers;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCapacity() {
        return capacityOfPassengers;
    }

    public void setCapacity(int capacityOfPassengers) {
        this.capacityOfPassengers = capacityOfPassengers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Aircraft -"          +
                "\nModel: "          + model    +
                "\nTypeOfAircraft: " + category +
                ",\nCapacity: "      + capacityOfPassengers +
                ",\nWeight: "        + weight   +
                ",\nMaxSpeed: "      + maxSpeed +
                ",\nRange: "         + range    + ".";
    }
}
