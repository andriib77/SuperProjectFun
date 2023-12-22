package AlexVersionAirportProject.aircrafts.cargoAircraft;

import AlexVersionAirportProject.aircrafts.aircraft.Aircraft;

public class CargoAircraft extends Aircraft {

    private CargoAircraft cargoAircraft;

    public CargoAircraft(String model, String category, CargoAircraft cargoAircraft,
                         int capacityOfPassengers, double weight, double maxSpeed, double range) {

        super(model, category, capacityOfPassengers, weight, maxSpeed, range);
        this.cargoAircraft = cargoAircraft;
    }

    public CargoAircraft getCargoAircraft() {
        return cargoAircraft;
    }

    public void setCargoAircraft(CargoAircraft cargoAircraft) {
        this.cargoAircraft = cargoAircraft;
    }
}
