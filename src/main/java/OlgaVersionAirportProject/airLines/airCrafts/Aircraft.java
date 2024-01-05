package OlgaVersionAirportProject.airLines.airCrafts;

public class Aircraft { //для пассажирских, грузовых, частных и военных самолетов
    private TypeOfAircraft typeOfAircraft;
    private String model;
    private String owner_AirLine;
    private double cargoLengthSM;
    private double cargoWidthSM; //Ширина грузового отсека
    private double cargoHeightSM;
    private double maxRangeWithLoadKM; //Дальность полета при максимальной нагрузке
   // private int ferryRange;  //Перегоночная дальность
    private double cruiseSpeedKM; //Крейсерская скорость
   // private int maxSpeed;
    private double maxTakeoffWeightKG; //Максимальный взлетный вес
    private double maxPayloadKG; //Максимальная полезная нагрузка
    private double maxFuelWeightKG; //Максимальный вес топлива

    private double fuelConsumptionPerHourKG;
    private int passengerCapacityPlaces;  // вместимость
    private int crewTeam;

    public Aircraft(TypeOfAircraft typeOfAircraft, String model, String owner_AirLine,
                    double cargoLengthSM, double cargoWidthSM, double cargoHeightSM,
                    double maxRangeWithLoadKM, double cruiseSpeedKM, double maxTakeoffWeightKG,
                    double maxPayloadKG, double maxFuelWeightKG, double fuelConsumptionPerHourKG,
                    int passengerCapacityPlaces, int crewTeam) {
        this.typeOfAircraft = typeOfAircraft;
        this.model = model;
        this.owner_AirLine = owner_AirLine;
        this.cargoLengthSM = cargoLengthSM;
        this.cargoWidthSM = cargoWidthSM;
        this.cargoHeightSM = cargoHeightSM;
        this.maxRangeWithLoadKM = maxRangeWithLoadKM;
        this.cruiseSpeedKM = cruiseSpeedKM;
        this.maxTakeoffWeightKG = maxTakeoffWeightKG;
        this.maxPayloadKG = maxPayloadKG;
        this.maxFuelWeightKG = maxFuelWeightKG;
        this.fuelConsumptionPerHourKG = fuelConsumptionPerHourKG;
        this.passengerCapacityPlaces = passengerCapacityPlaces;
        this.crewTeam = crewTeam;
    }

    public TypeOfAircraft getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(TypeOfAircraft typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner_AirLine() {
        return owner_AirLine;
    }

    public void setOwner_AirLine(String owner_AirLine) {
        this.owner_AirLine = owner_AirLine;
    }

    public double getCargoLengthSM() {
        return cargoLengthSM;
    }

    public void setCargoLengthSM(double cargoLengthSM) {
        this.cargoLengthSM = cargoLengthSM;
    }

    public double getCargoWidthSM() {
        return cargoWidthSM;
    }

    public void setCargoWidthSM(double cargoWidthSM) {
        this.cargoWidthSM = cargoWidthSM;
    }

    public double getCargoHeightSM() {
        return cargoHeightSM;
    }

    public void setCargoHeightSM(double cargoHeightSM) {
        this.cargoHeightSM = cargoHeightSM;
    }

    public double getMaxRangeWithLoadKM() {
        return maxRangeWithLoadKM
                ;
    }

    public void setMaxRangeWithLoadKM(double maxRangeWithLoadKM
    ) {
        this.maxRangeWithLoadKM = maxRangeWithLoadKM;
    }

    public double getCruiseSpeedKM() {
        return cruiseSpeedKM;
    }

    public void setCruiseSpeedKM(double cruiseSpeedKM) {
        this.cruiseSpeedKM = cruiseSpeedKM;
    }

    public double getMaxTakeoffWeightKG() {
        return maxTakeoffWeightKG;
    }

    public void setMaxTakeoffWeightKG(double maxTakeoffWeightKG) {
        this.maxTakeoffWeightKG = maxTakeoffWeightKG;
    }

    public double getMaxPayloadKG() {
        return maxPayloadKG;
    }

    public void setMaxPayloadKG(double maxPayloadKG) {
        this.maxPayloadKG = maxPayloadKG;
    }

    public double getMaxFuelWeightKG() {
        return maxFuelWeightKG;
    }

    public void setMaxFuelWeightKG(double maxFuelWeightKG) {
        this.maxFuelWeightKG = maxFuelWeightKG;
    }

    public double getFuelConsumptionPerHourKG() {
        return fuelConsumptionPerHourKG;
    }

    public void setFuelConsumptionPerHourKG(double fuelConsumptionPerHourKG) {
        this.fuelConsumptionPerHourKG = fuelConsumptionPerHourKG;
    }

    public int getPassengerCapacityPlaces() {
        return passengerCapacityPlaces;
    }

    public void setPassengerCapacityPlaces(int passengerCapacityPlaces) {
        this.passengerCapacityPlaces = passengerCapacityPlaces;
    }

    public int getCrewTeam() {
        return crewTeam;
    }

    public void setCrewTeam(int crewTeam) {
        this.crewTeam = crewTeam;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "typeOfAircraft=" + typeOfAircraft +
                ", model='" + model + '\'' +
                ", owner_AirLine='" + owner_AirLine + '\'' +
                ", cargoLengthSM=" + cargoLengthSM +
                ", cargoWidthSM=" + cargoWidthSM +
                ", cargoHeightSM=" + cargoHeightSM +
                ", maxRangeWithLoadKG=" + maxRangeWithLoadKM +
                ", cruiseSpeedKM=" + cruiseSpeedKM +
                ", maxTakeoffWeightKG=" + maxTakeoffWeightKG +
                ", maxPayloadKG=" + maxPayloadKG +
                ", maxFuelWeightKG=" + maxFuelWeightKG +
                ", fuelConsumptionPerHourKG=" + fuelConsumptionPerHourKG +
                ", passengerCapacityPlaces=" + passengerCapacityPlaces +
                ", crewTeam=" + crewTeam +
                '}';
    }
}
