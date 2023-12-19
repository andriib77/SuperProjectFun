package AndriiVersionAirportProject.baggage;

public class BaggageTest {
    public static void main(String[] args) {
        Bag bag = new Bag("122556545", "NY123");


        BaggageSystem baggageSystem = new BaggageSystem();
        baggageSystem.registerBag("122556545", "NY123");
        baggageSystem.trackBag("122556545");


    }
}
