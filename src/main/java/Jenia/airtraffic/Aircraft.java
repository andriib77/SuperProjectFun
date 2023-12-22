package Jenia.airtraffic;

public class Aircraft {
    private String model;
    private String typeOfAircraft;
    private int capacity;
    private double weight;
    private double maxSpeed;
    private double range;
    private double passengerWeight;
    private double fuelVolume;
    private double fuelConsumptionPerKm;

    public Aircraft(String model, String typeOfAircraft, int capacity, double weight, double maxSpeed,
                    double range, double passengerWeight, double fuelVolume, double fuelConsumptionPerKm) {
        this.model = model;
        this.typeOfAircraft = typeOfAircraft;
        this.capacity = capacity;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.passengerWeight = passengerWeight;
        this.fuelVolume = fuelVolume;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getRange() {
        return range;
    }

    public double getPassengerWeight() {
        return passengerWeight;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public double getTotalPayloadCapacity() {
        return getPassengerWeight() + getWeight() + getFuelVolume();
    }

    public double getOperationalPayloadCapacity() {
        return getPassengerWeight() + getWeight();
    }

    public double getFuelConsumptionPerKm() {
        // Учитываем вес пассажиров в расходе топлива
        return fuelConsumptionPerKm + 0.001 * passengerWeight;
    }
}