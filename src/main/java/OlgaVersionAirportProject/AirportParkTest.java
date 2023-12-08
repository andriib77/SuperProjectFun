package OlgaVersionAirportProject;

import java.util.List;

public class AirportParkTest {


    public static void main(String[] args) {
        // Create an instance of AircraftPark
        AircraftPark aircraftPark = new AircraftPark();

        // Add some aircraft to the park
        Aircraft passengerPlane1 = new Aircraft(TypeOfAircraft.PASSENGER, "Boeing 747-400ER", 300000,
                1800, 70, 70, 20, 5, 5, 3,
                800, 14000, 500, 988, 397000,
                200000, 80000, 524, 7);
        Aircraft passengerPlane2 = new Aircraft(TypeOfAircraft.PASSENGER, "Airbus A320-200", 220000,
                2090, 38, 36, 11, 4, 3, 3,
                3200, 6000, 400, 875, 90000,
                19200, 20000, 186, 5);
        Aircraft charterPlane = new Aircraft(TypeOfAircraft.CHARTER, "Embraer Legacy 600", 200000,
                1800, 26, 29, 7, 3, 1, 1,
                5900, 12496, 750, 834, 22500,
                500, 6000, 13, 3);
        Aircraft cargoPlane = new Aircraft(TypeOfAircraft.CARGO, "Boeing B767-300F", 300000,
                2000, 54, 52, 15, 4, 3, 3,
                5900, 10400, 850, 900, 186800,
                72000, 73000, 0, 5);
        Aircraft militaryPlane = new Aircraft(TypeOfAircraft.MILLITARY, "Boeing 747-200B(Air Force One)",
                300000, 1800, 70, 70, 19, 5, 5,
                3, 13000, 13700, 925, 1015,
                375000, 100000, 90000, 76, 26);

        // Add aircraft to the park
        aircraftPark.addAircraft(passengerPlane1);
        aircraftPark.addAircraft(passengerPlane2);
        aircraftPark.addAircraft(charterPlane);
        aircraftPark.addAircraft(cargoPlane);
        aircraftPark.addAircraft(militaryPlane);

        // Get and print categorized aircraft
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Aircraft> aircraftList = aircraftPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft);
                System.out.println("----");

            }
        }
        // Remove aircraft from  the park
        aircraftPark.removeAircraft(passengerPlane1);
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Aircraft> aircraftList = aircraftPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft);
            }
        }
    }
}