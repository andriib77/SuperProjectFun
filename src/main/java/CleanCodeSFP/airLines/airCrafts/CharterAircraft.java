package CleanCodeSFP.airLines.airCrafts;

public class CharterAircraft extends Aircraft {


    public CharterAircraft(TypeOfAircraft typeOfAircraft, String model,
                           String owner_AirflightCompany, int lifeTime,
                           int runwayLength, int length, int width, int height,
                           int cargoLength, int cargoWidth, int cargoHeight,
                           int maxRangeWithLoad, int ferryRange, int cruiseSpeed,
                           int maxSpeed, int maxTakeoffWeight, int maxPayload,
                           int maxFuelWeight, int passengerCapacity, int crewTeam) {
        super(typeOfAircraft, model, owner_AirflightCompany, lifeTime, runwayLength,
                length, width, height, cargoLength, cargoWidth, cargoHeight,
                maxRangeWithLoad, ferryRange, cruiseSpeed, maxSpeed,
                maxTakeoffWeight, maxPayload, maxFuelWeight, passengerCapacity, crewTeam);
    }

    @Override
    public String toString() {
        return "CharterAircraft{}";
    }
}
