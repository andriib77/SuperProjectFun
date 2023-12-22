package AlexVersionAirportProject.aircrafts.privateAircraft;

import AlexVersionAirportProject.aircrafts.aircraft.Aircraft;

public class PrivateAircraft extends Aircraft {

    private String owner;

    private PrivateAircraftType privateAircraftType;


    public PrivateAircraft(String owner, String model, String category,
                           PrivateAircraftType privateAircraftType, int capacityOfPassengers,
                           double weight, double maxSpeed, double range) {

        super(model, category, capacityOfPassengers, weight, maxSpeed, range);
        this.owner = owner;
        this.privateAircraftType = privateAircraftType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public PrivateAircraftType getPrivateAircraftType() {
        return privateAircraftType;
    }

    public void setPrivateAircraftType(PrivateAircraftType privateAircraftType) {
        this.privateAircraftType = privateAircraftType;
    }
}
