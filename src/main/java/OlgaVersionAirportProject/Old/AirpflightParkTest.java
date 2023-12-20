package OlgaVersionAirportProject.Old;

import java.util.List;

public class AirpflightParkTest {


    public static void main(String[] args) {
        // Create an instance of AircraftPark
        AirflighttPark airflighttPark = new AirflighttPark();

        // Add some aircraft to the park
        Airflight passengerPlane1 = new Airflight(TypeOfAircraft.PASSENGER, "Boeing 747-400ER", "Lufthansa", 300000,
                1800, 70, 70, 20, 5, 5, 3,
                800, 14000, 500, 988, 397000,
                200000, 80000, 524, 7, 7, 7, 7, 7);
        Airflight passengerPlane2 = new Airflight(TypeOfAircraft.PASSENGER, "Airbus A320-200", "AZAL",220000,
                2090,
                38, 36, 11, 4, 3, 3,
                3200, 6000, 400, 875, 90000,
                19200, 20000, 186, 5, 7, 7, 7, 7);
        Airflight charterPlane = new Airflight(TypeOfAircraft.CHARTER, "Embrace Legacy 600", "AZAL", 200000,
                1800, 26, 29, 7, 3, 1, 1,
                5900, 12496, 750, 834, 22500,
                500, 6000, 13, 3, 7, 7, 7, 7);
        Airflight cargoPlane = new Airflight(TypeOfAircraft.CARGO, "Boeing B767-300F", "Lufthansa", 300000,
                2000, 54, 52, 15, 4, 3, 3,
                5900, 10400, 850, 900, 186800,
                72000, 73000, 0, 5, 7, 7, 7, 7);
        Airflight militaryPlane = new Airflight(TypeOfAircraft.MILLITARY, "Boeing 747-200B(Air Force One)",
                "Lufthansa", 300000, 1800, 70, 70, 19, 5, 5,
                3, 13000, 13700, 925, 1015,
                375000, 100000, 90000, 76, 26, 7, 7, 7, 7);

        // Add aircraft to the park
        airflighttPark.addAircraft(passengerPlane1);
        airflighttPark.addAircraft(passengerPlane2);
        airflighttPark.addAircraft(charterPlane);
        airflighttPark.addAircraft(cargoPlane);
        airflighttPark.addAircraft(militaryPlane);

        // Get and print categorized aircraft
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Airflight> aircraftList = airflighttPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Airflight aircraft : aircraftList) {
                System.out.println(aircraft);
                System.out.println("----");

            }
        }
        // Remove aircraft from  the park
        airflighttPark.removeAircraft(passengerPlane1);
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Airflight> aircraftList = airflighttPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Airflight aircraft : aircraftList) {
                System.out.println(aircraft);
            }
        }
    }
}