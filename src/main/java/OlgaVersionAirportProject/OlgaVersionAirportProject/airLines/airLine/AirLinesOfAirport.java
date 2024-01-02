package OlgaVersionAirportProject.OlgaVersionAirportProject.airLines.airLine;

import Airport.OlgaVersionAirportProject.airLines.airCrafts.TypeOfAircraft;
import Airport.OlgaVersionAirportProject.airLines.flights.TypeOfFlights;
import Airport.OlgaVersionAirportProject.airLines.service.ServiceOfAirLine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AirLinesOfAirport {


    private static List<AirLine> airLineList;
    AirLine Lufthansa = new AirLine("DLH", "Lufthansa", "Germany",
            "International", 500, ServiceOfAirLine.PASSENGER_SERVICE,
            100, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine AZAL = new AirLine("AHY", "AZAL", "Azerbaijan ",
            "International", 500, ServiceOfAirLine.PASSENGERS_CARGO_LITERAL_SERVICE,
            50, TypeOfAircraft.PASSENGER_CHARTER, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine EasyJet = new AirLine("EZY", "EasyJet", "UK",
            "International", 300, ServiceOfAirLine.PASSENGER_SERVICE,
            10, TypeOfAircraft.PASSENGER_CHARTER, TypeOfFlights.REGULAR_AND_CHARTER_PASSENGER_FLIGHT);
    AirLine Qatar_Airways = new AirLine("QTR", "Qatar_Airways", "Qatar",
            "International", 500, ServiceOfAirLine.PASSENGERS_CARGO_LITERAL_SERVICE,
            100, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine Turkish_Airlines = new AirLine("THY", "Turkish_Airlines",
            "Turkey", "International", 200, ServiceOfAirLine.PASSENGERS_CARGO_LITERAL_SERVICE,
            50, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine Emirates = new AirLine("UAE", "Emirates", "United_Arab_Emirates",
            "International", 200, ServiceOfAirLine.SPECIAL_LITERAL_SERVICE, 50,
            TypeOfAircraft.SPECIAL, TypeOfFlights.LETTER_FLIGHT);
    AirLine Air_China = new AirLine("CCA", "Air_China", "China",
            "International", 200, ServiceOfAirLine.PASSENGERS_CARGO_LITERAL_SERVICE,
            50, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine SunExpress_Germany = new AirLine("SXD", "SunExpress_Germany",
            "Germany", "Regional", 30, ServiceOfAirLine.PASSENGER_SERVICE,
            10, TypeOfAircraft.CHARTER, TypeOfFlights.CHARTER_PASSENGER_FLIGHT);
    AirLine airBaltic = new AirLine("BTI", "airBaltic", "Latvia",
            "International", 150, ServiceOfAirLine.PASSENGERS_CARGO_SERVICE,
            50, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS);
    AirLine Lufthansa_Cargo = new AirLine("GEC", "Lufthansa_Cargo", "Germany",
            "International", 100, ServiceOfAirLine.CARGO_SERVICE,
            50, TypeOfAircraft.CARGO, TypeOfFlights.CHARTER_CARGO_FLIGHT);
    private Map<String, AirLine> airLineMap;

    public AirLinesOfAirport() {
        this.airLineList = new ArrayList<>();
        this.airLineMap = new HashMap<>();
        initializeAirLineList();
        initializeStringListMap();
    }

    public static void main(String[] args) {
        AirLinesOfAirport airLinesOfAirport = new AirLinesOfAirport();

        // Method to check info of airLines in airLinesList
        System.out.print("List of airlines of airport" + airLineList);
        System.out.println("-------");
        System.out.print("AirLines of Airport : " + airLinesOfAirport.airLineMap);
        System.out.println("-------");

        String lufthansaIdOfAirLine = airLinesOfAirport.Lufthansa.getIdOfAirLine();
        System.out.println("AirLine Luthhansa  ID is  " + airLinesOfAirport.Lufthansa.getIdOfAirLine());
        System.out.println("------");

        AirLine lufthansaFromMap = airLinesOfAirport.airLineMap.get("DLH");
        System.out.println("AirLine Lufthhansa info - " + lufthansaFromMap);
        System.out.println("-------");

        //Method to check  airLines by Type of Flights (also possible to check airlines by other criteria)

        TypeOfFlights typeOfFlights = TypeOfFlights.ALL_TYPE_OF_FLIGHTS;
        List<AirLine> airLineByTypeOfFlights = airLinesOfAirport.getAirLineByTypeOfFlights(typeOfFlights);
        if (airLineByTypeOfFlights != null) {
            System.out.println("AirLines with type of Flight: " + typeOfFlights);
            for (AirLine airLine : airLineByTypeOfFlights) {
                System.out.println(airLine.getNameOfAirLine());
                System.out.println("---- -----");
            }
        } else {
            System.out.println("No AirLines are found with  such type of Flight :"
                    + typeOfFlights);
            System.out.println("---- -----");

        }


        //Method to sort AirLines by Criteria:

        // Sort by Type of AirCraft

        TypeOfAircraft sortingCriteriaTypeOfAirCraft = TypeOfAircraft.CHARTER_CARGO;
        List<AirLine> sortedAirLinesByAircraftType = airLinesOfAirport.SortedAirlinesByTypeOfAirCraft(sortingCriteriaTypeOfAirCraft);
        if (sortedAirLinesByAircraftType != null) {
            System.out.println("Airlines with type of AirCraft : " + sortingCriteriaTypeOfAirCraft);
            for (AirLine airLine : sortedAirLinesByAircraftType) {
                System.out.println(airLine.getNameOfAirLine());
            }
        } else {
            System.out.println("No AirLines are found with such type of AirCraft ");

            System.out.println("---- ----- -----");
        }

        //Sort by type of AirLine

        String typeOfAirLine = "Regional";
        List<AirLine> sortedAirlinesByTypeOfAirLine = airLinesOfAirport.SortedAirlinesByTypeOfAirLine(typeOfAirLine);
        if (sortedAirlinesByTypeOfAirLine != null) {
            System.out.println("There is the List of  : " + typeOfAirLine + " Airlines");
            for (AirLine airLine : sortedAirlinesByTypeOfAirLine) {
                System.out.println(airLine.getNameOfAirLine());
                System.out.println("---- ----- -");
            }
        } else {
            System.out.println("There is not found such AirLines : " + typeOfAirLine);

            System.out.println("---- ----- -");


        }

        //Sort by type of  Country Of Origin

        String countryOfOrigin = "Qatar";
        List<AirLine> sortedAirlinesByCountry = airLinesOfAirport.SortedAirlinesByCountry(countryOfOrigin);
        if (sortedAirlinesByCountry != null) {
            System.out.println("There is the List of  : " + countryOfOrigin + " Airlines");
            for (AirLine airLine : sortedAirlinesByCountry) {
                System.out.println(airLine.getNameOfAirLine());
                System.out.println("---- ");
            }
        } else {
            System.out.println("There is not found such AirLines : " + countryOfOrigin);

            System.out.println("---- ");

        }

        //Sort by type of  Service of AirLine
        ServiceOfAirLine sortingByService = ServiceOfAirLine.PASSENGER_SERVICE;
        List<AirLine> airLinesByService = airLinesOfAirport.SortedByServiceOfAirLine(sortingByService);
        if (airLinesByService != null) {
            System.out.println("Airlines with type of Service : " + sortingByService);
            for (AirLine airLine : airLinesByService) {
                System.out.println(airLine.getNameOfAirLine());
                System.out.println("- -- ---");
            }
        } else {
            System.out.println("No AirLines are found with such type of Service ");

            System.out.println("- -- ---");
        }

    }

    private void initializeAirLineList() {
        airLineList.add(Lufthansa);
        airLineList.add(AZAL);
        airLineList.add(EasyJet);
        airLineList.add(Qatar_Airways);
        airLineList.add(Turkish_Airlines);
        airLineList.add(Emirates);
        airLineList.add(Air_China);
        airLineList.add(SunExpress_Germany);
        airLineList.add(airBaltic);
        airLineList.add(Lufthansa_Cargo);

    }

    private void initializeStringListMap() {
        for (AirLine airLine : airLineList) {
            airLineMap.put(airLine.getIdOfAirLine(), airLine);
        }
    }

    //Method to sort AirLines by Criteria:

    //Method to check  airLines by Type of Flights (also possible to check airlines by other criteria)
    private List<AirLine> getAirLineByTypeOfFlights(TypeOfFlights typeOfFlights) {
        List<AirLine> airLineByTypeOfFlights = new ArrayList<>();
        for (AirLine airLine : airLineList) {
            if ((airLine.getTypeOfFlights()) == typeOfFlights) {
                airLineByTypeOfFlights.add(airLine);
            }
        }

        return airLineByTypeOfFlights;
    }

    // Sort by Type of AirCraft
    private List<AirLine> SortedAirlinesByTypeOfAirCraft(TypeOfAircraft typeOfAircraft) {
        List<AirLine> airLinesByTypeOfAirCrafts = airLineList.stream()
                .filter(airline -> airline.getTypeOfAircraft() == typeOfAircraft)
                .collect(Collectors.toList());

        if (airLinesByTypeOfAirCrafts.isEmpty()) {
            System.out.println("No airlines with type of aircraft: " + typeOfAircraft);
            return airLinesByTypeOfAirCrafts;
        }

        airLinesByTypeOfAirCrafts.sort(Comparator.comparing(AirLine::getNameOfAirLine));

        System.out.println("Airlines are sorted by type of AirCrafts : " + airLinesByTypeOfAirCrafts);
        System.out.println("Airlines with type of AirCraft : " + typeOfAircraft);
        for (AirLine airLine : airLinesByTypeOfAirCrafts) {
            System.out.println(airLine.getNameOfAirLine());
        }

        System.out.println("---- ----- -----");

        return airLinesByTypeOfAirCrafts;
    }

    //Sort by type of AirLine
    private List<AirLine> SortedAirlinesByTypeOfAirLine(String typeOfAirLine) {
        List<AirLine> airLinesByTypeOfAirLine = airLineList.stream()
                .filter(airline -> airline.getTypeOfAirLine() == typeOfAirLine)
                .collect(Collectors.toList());

        if (airLinesByTypeOfAirLine.isEmpty()) {
            System.out.println("No airlines with type of aircraft: " + typeOfAirLine);
            return airLinesByTypeOfAirLine;
        }

        airLinesByTypeOfAirLine.sort(Comparator.comparing(AirLine::getNameOfAirLine));

        System.out.println("Airlines are sorted by type of AirLine : " + airLinesByTypeOfAirLine);
        System.out.println("Airlines with type of AirLine : " + typeOfAirLine);
        for (AirLine airLine : airLinesByTypeOfAirLine) {
            System.out.println(airLine.getNameOfAirLine());
        }

        System.out.println("---- ----- -----");

        return airLinesByTypeOfAirLine;
    }

    //Sort by type of  Country Of Origin
    private List<AirLine> SortedAirlinesByCountry(String countryOfOrigin) {
        List<AirLine> airLinesByCountry = airLineList.stream()
                .filter(airline -> airline.getCountryOfOrigin() == countryOfOrigin)
                .collect(Collectors.toList());

        if (airLinesByCountry.isEmpty()) {
            System.out.println("No airlines with county of origin : " + countryOfOrigin);
            return airLinesByCountry;
        }

        airLinesByCountry.sort(Comparator.comparing(AirLine::getNameOfAirLine));

        System.out.println("Airlines with country of origin : " + countryOfOrigin);
        System.out.println("Airlines are sorted by county of origin : " + airLinesByCountry);

        for (AirLine airLine : airLinesByCountry) {
            System.out.println(airLine.getNameOfAirLine());
        }

        System.out.println("---- ----- -----");

        return airLinesByCountry;
    }

    //Sort by type of  Service of AirLine
    private List<AirLine> SortedByServiceOfAirLine(ServiceOfAirLine serviceOfAirLine) {
        List<AirLine> airLinesByService = airLineList.stream()
                .filter(airline -> airline.getServiceOfAirLine() == serviceOfAirLine)
                .collect(Collectors.toList());

        if (airLinesByService.isEmpty()) {
            System.out.println("No airlines with type of Service : " + serviceOfAirLine);
            System.out.println("- - -");
            return airLinesByService;
        }

        airLinesByService.sort(Comparator.comparing(AirLine::getNameOfAirLine));

        System.out.println("Airlines are sorted by type of Service : " + airLinesByService);
        System.out.println("Airlines with type of Service : " + serviceOfAirLine);
        for (AirLine airLine : airLinesByService) {
            System.out.println(airLine.getNameOfAirLine());
        }
        System.out.println("- - -");

        return airLinesByService;
    }
}

