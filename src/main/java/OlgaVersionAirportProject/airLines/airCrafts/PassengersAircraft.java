package OlgaVersionAirportProject.airLines.airCrafts;

public class PassengersAircraft extends Aircraft {


    public PassengersAircraft(TypeOfAircraft typeOfAircraft, String model, String owner_AirLine,
                              double cargoLengthSM, double cargoWidthSM, double cargoHeightSM,
                              double maxRangeWithLoadKM, double cruiseSpeedKM, double maxTakeoffWeightKG,
                              double maxPayloadKG, double maxFuelWeightKG, double fuelConsumptionPerHourKG,
                              int passengerCapacityPlaces, int crewTeam) {
        super(typeOfAircraft, model, owner_AirLine, cargoLengthSM, cargoWidthSM, cargoHeightSM,
                maxRangeWithLoadKM, cruiseSpeedKM, maxTakeoffWeightKG, maxPayloadKG, maxFuelWeightKG,
                fuelConsumptionPerHourKG, passengerCapacityPlaces, crewTeam);
    }

    @Override
    public String toString() {
        return "PassengersAircraft{}";
    }
}

