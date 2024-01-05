package OlgaVersionAirportProject.airLines.airCrafts;

import java.util.List;

public class AirCraftParkTest {


    public static void main(String[] args) {
        // Create an instance of AircraftPark
        AirCraftPark airCraftPark = new AirCraftPark();

        // Add some aircraft to the park
        Aircraft LufthhansaAirCraft1 = new Aircraft(TypeOfAircraft.PASSENGER, "Boeing 777-200ER",
                "Lufthansa", 1562, 153, 162, 12100,
                900, 240000, 50850, 135900,
                7000, 440,6);

        Aircraft LufthhansaAirCraft2 = new Aircraft(TypeOfAircraft.PASSENGER, "Boeing 747-400",
                "Lufthansa", 1562, 264, 162, 12200,
                920, 394000, 69000, 216846,
                8460, 524,10);

        Aircraft AzalAirCraft1 = new Aircraft(TypeOfAircraft.PASSENGER, "Airbus A320-200",
                "AZAL",124,182,119,3000,
                840, 73500, 18500,19100,
                2500,180,6);

        Aircraft EmiratesAirCraft1 = new Aircraft(TypeOfAircraft.PASSENGER, "Embrace Legacy 600",
                "Emirates", 124, 156,119,6019,
                828,22500,2000,8000,1400,
                13,3);

        Aircraft Lufthansa_CargoAirCraftl = new Aircraft(TypeOfAircraft.CARGO, "Boeing B767-300F",
                "Lufthansa_Cargo", 4064,400, 254, 6056,
                850, 186800, 54000, 90000,
                4800, 0, 2);


        Aircraft Qatar_AirwaysAirCraft1= new Aircraft(TypeOfAircraft.SPECIAL, "Boeing 747-200B(Air Force One)",
                "Qatar_Airways", 1570, 299, 274, 13747,
                939, 377842, 68180,198370,
                6100, 102, 26);

        // Add aircraft to the park
        airCraftPark.addAircraft(LufthhansaAirCraft1);
        airCraftPark.addAircraft(LufthhansaAirCraft2);
        airCraftPark.addAircraft(AzalAirCraft1);
        airCraftPark.addAircraft(EmiratesAirCraft1);
        airCraftPark.addAircraft(Lufthansa_CargoAirCraftl);
        airCraftPark.addAircraft(Qatar_AirwaysAirCraft1);


        // Get and print categorized aircraft
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Aircraft> aircraftList = airCraftPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft);
                System.out.println("----");

            }
        }
        // Remove aircraft from  the park
        airCraftPark.removeAircraft(LufthhansaAirCraft1);
        for (TypeOfAircraft type : TypeOfAircraft.values()) {
            List<Aircraft> aircraftList = airCraftPark.getAllAircrafts(type);
            System.out.println("\n" + type + " Aircraft:");
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft);
            }
        }
    }
}