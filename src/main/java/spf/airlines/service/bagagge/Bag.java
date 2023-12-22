package spf.airlines.service.bagagge;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bag {
    // Уникальный номер для отслеживания багажа
    //TODO брать id пассажира
    //TODO name of passenger
    //TODO number of flight
    //TODO id of airline

    @Override
    public String toString() {
        return "Bag{" +
                "trackingBagNumber=" + trackingBagNumber +
                ", baggageType='" + baggageType + '\'' +
                ", weight=" + weight +
                ", isChecked=" + isChecked +
                ", isLoaded=" + isLoaded +
                ", destination='" + destination + '\'' +
                ", baggageStatus=" + baggageStatus +
                ", isIssued=" + isIssued +
                ", route=" + route +
                '}';
    }

    private UUID trackingBagNumber;

    // Тип багажа
    private String baggageType;

    // Вес багажа
    private double weight;

    // Флаг, указывающий, прошел ли багаж проверку
    private boolean isChecked;

    // Флаг, указывающий, загружен ли багаж в самолет
    private boolean isLoaded;

    // Пункт назначения багажа
    private String destination;

    // Статус багажа (например, "Not Checked", "Checked", "Loaded")
    private BaggageStatus baggageStatus;

    // Флаг, указывающий, является ли багаж прямым рейсом или с транзитом
    private boolean isIssued;

    // Новое поле для хранения маршрута багажа в виде списка аэропортов
    private List<String> route;

    public Bag(String baggageType, double weight, boolean isChecked, boolean isLoaded, String destination, BaggageStatus baggageStatus, boolean isIssued) {
        this.trackingBagNumber = UUID.randomUUID();;
        this.baggageType = baggageType;
        this.weight = weight;
        this.isChecked = isChecked;
        this.isLoaded = isLoaded;
        this.destination = destination;
        this.baggageStatus = baggageStatus;
        this.isIssued = isIssued;
        this.route = new ArrayList<>();
    }

    public UUID getTrackingBagNumber() {
        return trackingBagNumber;
    }

    public String getBaggageType() {
        return baggageType;
    }

    public void setBaggageType(String baggageType) {
        this.baggageType = baggageType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BaggageStatus getBaggageStatus() {
        return baggageStatus;
    }

    public void setBaggageStatus(BaggageStatus baggageStatus) {
        this.baggageStatus = baggageStatus;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    // Метод для добавления аэропорта в маршрут багажа
    public void addToRoute(String airport) {
        route.add(airport);
    }

    // Метод для получения маршрута багажа
    public List<String> getRoute() {
        return route;
    }

}
