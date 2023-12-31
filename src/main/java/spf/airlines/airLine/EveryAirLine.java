package spf.airlines.airLine;

import spf.airlines.airCrafts.TypeOfAircraft;
import spf.airlines.flights.TypeOfFlights;
import spf.airlines.service.ServiceOfAirLine;

public class EveryAirLine {
    private String idOfAirLine;
    private String nameOfAirLine;
    private String countryOfOrigin;
    private String typeOfAirLine;
    private int staffOfAirLine;
    private ServiceOfAirLine serviceOfAirLine;
    private int airCrafts;
    private TypeOfAircraft typeOfAircraft;
    private TypeOfFlights typeOfFlights;

    public EveryAirLine(String idOfAirLine, String nameOfAirLine, String countryOfOrigin, String typeOfAirLine, int staffOfAirLine,
                        ServiceOfAirLine serviceOfAirLine, int airCrafts,
                        TypeOfAircraft typeOfAircraft, TypeOfFlights typeOfFlights) {
        this.idOfAirLine = idOfAirLine;
        this.nameOfAirLine = nameOfAirLine;
        this.countryOfOrigin = countryOfOrigin;
        this.typeOfAirLine = typeOfAirLine;
        this.staffOfAirLine = staffOfAirLine;
        this.serviceOfAirLine = serviceOfAirLine;
        this.airCrafts = airCrafts;
        this.typeOfAircraft = typeOfAircraft;
        this.typeOfFlights = typeOfFlights;
    }

    public String getIdOfAirLine() {
        return idOfAirLine;
    }

    public String getNameOfAirLine() {
        return nameOfAirLine;
    }

    public void setNameOfAirLine(String nameOfAirLine) {
        this.nameOfAirLine = nameOfAirLine;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getTypeOfAirLine() {
        return typeOfAirLine;
    }

    public void setTypeOfAirLine(String typeOfAirLine) {
        this.typeOfAirLine = typeOfAirLine;
    }

    public int getStaffOfAirLine() {
        return staffOfAirLine;
    }

    public void setStaffOfAirLine(int staffOfAirLine) {
        this.staffOfAirLine = staffOfAirLine;
    }

    public ServiceOfAirLine getServiceOfAirLine() {
        return serviceOfAirLine;
    }

    public void setServiceOfAirLine(ServiceOfAirLine serviceOfAirLine) {
        this.serviceOfAirLine = serviceOfAirLine;
    }

    public int getAirCrafts() {
        return airCrafts;
    }

    public TypeOfAircraft getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(TypeOfAircraft typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public TypeOfFlights getTypeOfFlights() {
        return typeOfFlights;
    }

    public void setTypeOfFlights(TypeOfFlights typeOfFlights) {
        this.typeOfFlights = typeOfFlights;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "idOfAirline='" + idOfAirLine  + '\'' +
                "nameOfAirLine='" + nameOfAirLine + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", typeOfAirLine='" + typeOfAirLine + '\'' +
                ", staffOfAirLine=" + staffOfAirLine +
                ", serviceOfAirLine=" + serviceOfAirLine +
                ", airCrafts=" + airCrafts +
                ", typeOfAircraft=" + typeOfAircraft +
                ", typeOfFlights=" + typeOfFlights +
                '}';
    }
}
