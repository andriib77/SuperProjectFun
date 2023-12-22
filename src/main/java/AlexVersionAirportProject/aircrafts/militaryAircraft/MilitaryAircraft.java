package AlexVersionAirportProject.aircrafts.militaryAircraft;

import AlexVersionAirportProject.aircrafts.aircraft.Aircraft;

public class MilitaryAircraft extends Aircraft {

    private MilitaryAircraftType militaryAircraftType;

    public MilitaryAircraft(String model, String category,
                            MilitaryAircraftType militaryAircraftType, int capacityOfPassengers,
                            double weight, double maxSpeed, double range) {

        super(model, category, capacityOfPassengers, weight, maxSpeed, range);
        this.militaryAircraftType = militaryAircraftType;
    }

    public MilitaryAircraftType getMilitaryAircraftType() {
        return militaryAircraftType;
    }

    public void setMilitaryAircraftType(MilitaryAircraftType militaryAircraftType) {
        this.militaryAircraftType = militaryAircraftType;
    }
}
