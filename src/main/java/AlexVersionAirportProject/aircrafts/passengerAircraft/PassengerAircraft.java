package AlexVersionAirportProject.aircrafts.passengerAircraft;

import AlexVersionAirportProject.aircrafts.aircraft.Aircraft;

public class PassengerAircraft extends Aircraft {

    private PassengerAircraftType passengerAircraftType;

    public PassengerAircraft(String model, String category,
                             PassengerAircraftType passengerAircraftType, int capacityOfPassengers,
                             double weight, double maxSpeed, double range) {

        super(model, category, capacityOfPassengers, weight, maxSpeed, range);
        this.passengerAircraftType = passengerAircraftType;
    }

    public PassengerAircraftType getComfortClass() {
        return passengerAircraftType;
    }

    public void setComfortClass(PassengerAircraftType comfortClass) {
        this.passengerAircraftType = passengerAircraftType;
    }
}
