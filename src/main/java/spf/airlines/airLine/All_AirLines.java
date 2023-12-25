package spf.airlines.airLine;

import spf.airlines.flights.TypeOfFlights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class All_AirLines {
    private List<EveryAirLine> airLineList;
    private Map< String, List<EveryAirLine>> stringListMap;

    public All_AirLines(List<EveryAirLine> airLineList, Map<String, List<All_AirLines>> stringListMap) {
        this.airLineList = new ArrayList<>();
        this.stringListMap = new HashMap<>();
        initializeStringListMap();
    }


    private  void  initializeStringListMap() {

        for (TypeOfFlights typeOfFlights: TypeOfFlights.values()); {
            stringListMap.put(airLineList.toString(), new ArrayList<>());

        }
    }
    public void addAirLine (EveryAirLine airLine){
        airLineList.add(airLine);
        airLineList.toString();
    }

    public void removeAirLine (EveryAirLine airLine){
        airLineList.remove(airLine);
        airLineList.toString();
    }

    // Method to get all airlines by the typeOfFlights
    public List<EveryAirLine> getAirLineByTypeOfFlights(TypeOfFlights typeOfFlights){
        String key = typeOfFlights.toString();
        return stringListMap.getOrDefault(key, new ArrayList<>());
    }

    // Method to get all airlines as a list
    public List<EveryAirLine> getAirLineLists() {
        return new ArrayList<>(airLineList);
    }
}
