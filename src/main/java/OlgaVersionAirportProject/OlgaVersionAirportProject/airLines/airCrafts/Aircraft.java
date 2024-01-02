package OlgaVersionAirportProject.OlgaVersionAirportProject.airLines.airCrafts;

public class Aircraft { //для пассажирских, грузовых, частных и военных самолетов
    private TypeOfAircraft typeOfAircraft;
    private String model;

    private String owner_AirflightCompany;

    private int lifeTime; //Срок службы
    private int runwayLength; //Длина взлётно-посадочной полосы
    private int length; //
    private int width;
    private int  height;
    private int cargoLength ;
    private int cargoWidth; //Ширина грузового отсека
    private int cargoHeight;
    private int maxRangeWithLoad; //Дальность полета при максимальной нагрузке
    private int ferryRange;  //Перегоночная дальность
    private int cruiseSpeed; //Крейсерская скорость
    private int maxSpeed;
    private int maxTakeoffWeight; //Максимальный взлетный вес
    private int maxPayload; //Максимальная полезная нагрузка
    private int maxFuelWeight; //Максимальный вес топлива
    private int passengerCapacity;  // вместимость
    private int crewTeam;

    public Aircraft(TypeOfAircraft typeOfAircraft, String model, String owner_AirflightCompany,
                    int lifeTime, int runwayLength, int length,
                    int width, int height, int cargoLength,
                    int cargoWidth, int cargoHeight, int maxRangeWithLoad,
                    int ferryRange, int cruiseSpeed, int maxSpeed,
                    int maxTakeoffWeight, int maxPayload, int maxFuelWeight,
                    int passengerCapacity, int i, int i1, int i2, int i3, int i4)
    {
        this.typeOfAircraft = typeOfAircraft;
        this.model = model;
        this.owner_AirflightCompany=owner_AirflightCompany;
        this.lifeTime = lifeTime;
        this.runwayLength = runwayLength;
        this.length = length;
        this.width = width;
        this.height = height;
        this.cargoLength = cargoLength;
        this.cargoWidth = cargoWidth;
        this.cargoHeight = cargoHeight;
        this.maxRangeWithLoad = maxRangeWithLoad;
        this.ferryRange = this.ferryRange;
        this.cruiseSpeed = cruiseSpeed;
        this.maxSpeed = maxSpeed;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.maxPayload = maxPayload;
        this.maxFuelWeight = maxFuelWeight;
        this.passengerCapacity = passengerCapacity;
        this.crewTeam = crewTeam;
    }

    public Aircraft(String s, int i, int lifeTime, int runwayLength, int length, TypeOfAircraft typeOfAircraft) {
    }

    public TypeOfAircraft getTypeOfAircraft() {
        return typeOfAircraft;
    }


    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = TypeOfAircraft.valueOf(typeOfAircraft);
    }

    public String getOwner_AirflightCompany() {
        return owner_AirflightCompany;
    }

    public void setOwner_AirflightCompany(String owner_AirflightCompany) {
        this.owner_AirflightCompany = owner_AirflightCompany;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public int getRunwayLength() {
        return runwayLength;
    }

    public void setRunwayLength(int runwayLength) {
        this.runwayLength = runwayLength;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCargoLength() {
        return cargoLength;
    }

    public void setCargoLength(int cargoLength) {
        this.cargoLength = cargoLength;
    }

    public int getCargoWidth() {
        return cargoWidth;
    }

    public void setCargoWidth(int cargoWidth) {
        this.cargoWidth = cargoWidth;
    }

    public int getCargoHeight() {
        return cargoHeight;
    }

    public void setCargoHeight(int cargoHeight) {
        this.cargoHeight = cargoHeight;
    }

    public int getMaxRangeWithLoad() {
        return maxRangeWithLoad;
    }

    public void setMaxRangeWithLoad(int maxRangeWithLoad) {
        this.maxRangeWithLoad = maxRangeWithLoad;
    }

    public int getFerryRange() {
        return ferryRange;
    }

    public void setFerryRange(int ferryRange) {
        this.ferryRange = ferryRange;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public void setMaxTakeoffWeight(int maxTakeoffWeight) {
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }

    public int getMaxFuelWeight() {
        return maxFuelWeight;
    }

    public void setMaxFuelWeight(int maxFuelWeight) {
        this.maxFuelWeight = maxFuelWeight;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
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
                ", owner_AirflightCompany='" + owner_AirflightCompany + '\'' +
                ", lifeTime=" + lifeTime +
                ", runwayLength=" + runwayLength +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", cargoLength=" + cargoLength +
                ", cargoWidth=" + cargoWidth +
                ", cargoHeight=" + cargoHeight +
                ", maxRangeWithLoad=" + maxRangeWithLoad +
                ", ferryRange=" + ferryRange +
                ", cruiseSpeed=" + cruiseSpeed +
                ", maxSpeed=" + maxSpeed +
                ", maxTakeoffWeight=" + maxTakeoffWeight +
                ", maxPayload=" + maxPayload +
                ", maxFuelWeight=" + maxFuelWeight +
                ", passengerCapacity=" + passengerCapacity +
                ", crewTeam=" + crewTeam +
                '}';
    }
}
