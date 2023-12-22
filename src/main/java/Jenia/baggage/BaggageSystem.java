package Jenia.baggage;

import Jenia.airtraffic.Flight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaggageSystem {
    private Map<String, Bag> bags;

    public BaggageSystem() {
        this.bags = new HashMap<>();
    }

    public Map<String, Bag> getBags() {
        return bags;
    }

    public void setBags(Map<String, Bag> bags) {
        this.bags = bags;
    }

    // Метод для регистрации нового багажа
    public void registerBag(String trackingNumber, String destination) {
        Bag bag = new Bag(trackingNumber, destination);
        bags.put(trackingNumber, bag);
    }

    // Метод для отслеживания перемещения багажа
    public void trackBag(String trackingNumber) {
        Bag bag = bags.get(trackingNumber);
        if (bag != null) {
            System.out.println("Bag Tracking Information: " + bag);
        } else {
            System.out.println("Bag not found with tracking number: " + trackingNumber);
        }
    }

    // Метод для автоматической сортировки и доставки багажа
    public void automateBaggageHandling(List<Flight> flights) {
        for (Flight flight : flights) {
            for (Bag bag : bags.values()) {
                if (bag.getDestination().equalsIgnoreCase(flight.getDestinationCity())) {
                    bag.loadBag();
                    System.out.println("Bag " + bag.getTrackingNumber() + " loaded onto Flight " + flight.getFlightNumber());
                }
            }
        }
    }
}
