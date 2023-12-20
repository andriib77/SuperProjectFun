package OlgaVersionAirportProject.Old;

public class MilitaryAircraft extends Airflight {


    public MilitaryAircraft(TypeOfAircraft typeOfAircraft, String model,
                            String owner_AirflightCompany, int runwayLength,
                            int length, int width, int height, int cargoLength,
                            int cargoWidth, int cargoHeight, int maxRangeWithLoad,
                            int ferryRange, int cruiseSpeed, int maxSpeed,
                            int maxTakeoffWeight, int maxPayload, int maxFuelWeight,
                            int passengerCapacity, int crewTeam) {
        super(typeOfAircraft, model, owner_AirflightCompany, runwayLength,
                length, width, height, cargoLength, cargoWidth, cargoHeight,
                maxRangeWithLoad, ferryRange, cruiseSpeed, maxSpeed, maxTakeoffWeight,
                maxPayload, maxFuelWeight, passengerCapacity, crewTeam, 7, 7, 7, 7, 7);
    }

    @Override
    public String toString() {
        return "MilitaryAircraft{}";
    }
}
