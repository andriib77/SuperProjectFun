package CleanCodeSFP.airLines.service.bagagge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaggageSystem {
    // Карта для отслеживания багажа по уникальному номеру
    private Map<String, Bag> baggageMap;

    public BaggageSystem() {
        this.baggageMap = new HashMap<>();
    }

    // Метод для регистрации багажа в системе
    public void registerBag(Bag bag) {
        baggageMap.put(bag.getTrackingNumber(), bag);
    }

    // Метод для получения информации о статусе и местоположении багажа по его уникальному номеру
    public String getBaggageStatus(String trackingNumber) {
        Bag bag = baggageMap.get(trackingNumber);
        if (bag != null) {
            return "Status: " + bag.getBaggageStatus() + ", Location: " + determineBaggageLocation(bag);
        } else {
            return "Baggage with tracking number " + trackingNumber + " not found.";
        }
    }

    // Метод для определения местоположения багажа
    private String determineBaggageLocation(Bag bag) {
        if (bag.isLoaded()) {
            return "On board flight to " + bag.getDestination();
        } else if (bag.isChecked()) {
            return "In the airport, awaiting loading onto a flight";
        } else {
            return "Not yet checked";
        }
    }

    // Метод для отслеживания маршрута багажа
    public void trackBagRoute(String trackingNumber) {
        Bag bag = baggageMap.get(trackingNumber);
        if (bag != null) {
            List<String> route = bag.getRoute();
            if (route != null && !route.isEmpty()) {
                System.out.println("Bag " + trackingNumber + " route: " + route);
            } else {
                System.out.println("Bag " + trackingNumber + " has no route information.");
            }
        } else {
            System.out.println("Bag with tracking number " + trackingNumber + " not found.");
        }
    }
}
