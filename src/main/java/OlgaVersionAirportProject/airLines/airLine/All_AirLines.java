package OlgaVersionAirportProject.airLines.airLine;

import Airport.OlgaVersionAirportProject.airLines.flights.TypeOfFlights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.System.*;
import static java.lang.System.out;

public class All_AirLines {
    public List<AirLine> airLineList;
    public Map< String, List<AirLine>> airLineMap;

    public void All_AirLines(List<AirLine> airLineList, Map<String, List<All_AirLines>> airLineMap) {
        this.airLineList = new ArrayList<>();
        this.airLineMap = new HashMap<>();
       initializeStringListMap();
    }

    private void initializeAirLineList() {

    }


    private  void  initializeStringListMap() {

        for (TypeOfFlights typeOfFlights: TypeOfFlights.values()); {
            airLineMap.put(airLineList.toString(), new ArrayList<>());

        }
    }
    public void addAirLine (AirLine airLine){
        airLineList.add(airLine);
        airLine.toString();
        airLineMap.put(airLine.getIdOfAirLine(), (List<AirLine>) airLine);
        out.println("List of AirLines : " + airLineMap);
    }

    public void removeAirLine (AirLine airLine){
        airLineList.remove(airLine);
        airLineList.toString();
        airLineMap.put(airLine.getIdOfAirLine(), (List<AirLine>) airLine);
        out.println("List of AirLines : " + airLineMap);
    }

    // Method to get all airlines by the typeOfFlights
    public List<AirLine> getAirLineByTypeOfFlights(TypeOfFlights typeOfFlights){
        String key = typeOfFlights.toString();
        return airLineMap.getOrDefault(key, new ArrayList<>());
    }

    // Method to get all airlines as a list
    public List<AirLine> getAirLineLists() {
        return new ArrayList<>(airLineList);
    }
    //Representation of AirLines list by criteria

    public void sortAirLinesByCriteria (String criteria){
        // !!! If criteria is Enum Class use (Enum type of enum ), (f.e. TypeOfAircraft typeOfAirCraft)
        switch (criteria){
            case "typeOfFlights":
                Collections.sort(airLineList, Comparator.comparing(AirLine::getTypeOfFlights));
                out.println(airLineList);
                break;
            //case "typeOfAircraft":
                //Collections.sort(airLineList, Comparator.comparing(AirLine::getTypeOfAircraft));
              //  out.println(airLineList);
               // break;
            case "typeOfAirLine":
                Collections.sort(airLineList, Comparator.comparing(AirLine::getTypeOfAirLine));
                out.println(airLineList);
                break;
            case "countryOfOrigin":
                Collections.sort(airLineList, Comparator.comparing(AirLine::getCountryOfOrigin));
                out.println(airLineList);
                break;
            case "serviceOfAirLine":
                Collections.sort(airLineList, Comparator.comparing(AirLine::getServiceOfAirLine));
                out.println(airLineList);
                break;
            case "default":
            default:
                out.println("Invalid sorting criteria");
        }
    }

    // Representation  all info for every AirLine in the List
    public String getAllAirLinesInfo(){
        StringBuilder result = new StringBuilder();
        for (AirLine airLine : airLineList){
            result.append(airLine.toString());

        }
        return result.toString();
    }
    // Get an AirLine by ID from the Map

    public List<AirLine> getAirLineByID(String idOfAirLine) {
        return airLineMap.get(idOfAirLine);

    }
}
