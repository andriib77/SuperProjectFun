package OlgaVersionAirportProject.Old.airflightCompanies;

import OlgaVersionAirportProject.Old.AirflighttPark;

public class AirflightCompany {

    private String nameOfCompany;
    private String specialisation;
    private String flightsNetwork;
    private String flightTypes;
    private Staff staff;
    private int foreignAirportOffices;
    private int airFlightPark;
    private AirflighttPark airflighttPark;

    public AirflightCompany() {
        this.nameOfCompany = nameOfCompany;
        this.specialisation = specialisation;
        this.flightsNetwork = flightsNetwork;
        this.flightTypes = flightTypes;
        this.staff = staff;
        this.foreignAirportOffices = foreignAirportOffices;
        this.airFlightPark = airFlightPark;
        this.airflighttPark = airflighttPark;
    }

    public AirflightCompany(String lufthansa, Object o) {
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getFlightsNetwork() {
        return flightsNetwork;
    }

    public void setFlightsNetwork(String flightsNetwork) {
        this.flightsNetwork = flightsNetwork;
    }

    public String getFlightTypes() {
        return flightTypes;
    }

    public void setFlightTypes(String flightTypes) {
        this.flightTypes = flightTypes;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getAirFlightPark() {
        return airFlightPark;
    }

    public void setAirFlightPark(int airFlightPark) {
        this.airFlightPark = airFlightPark;
    }

    public int getForeignAirportOffices() {
        return foreignAirportOffices;
    }

    public void setForeignAirportOffices(int foreignAirportOffices) {
        this.foreignAirportOffices = foreignAirportOffices;
    }


    @Override
    public String toString() {
        return "AirflightCompany{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", flightsNetwork='" + flightsNetwork + '\'' +
                ", flightTypes='" + flightTypes + '\'' +
                ", staff=" + staff +
                ", airFlightPark=" + airFlightPark +
                ", foreignAirportOffices=" + foreignAirportOffices +
                '}';
    }
}
