package OlgaVersionAirportProject.airLines.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsOfAirLine  {
    private List<FlightsOfAirLine> flightsOfAirLineList;

    public FlightsOfAirLine(List<FlightsOfAirLine> flightsOfAirLineList) {
        this.flightsOfAirLineList = new ArrayList<>();
    }
    public void addFlight (FlightsOfAirLine flightsOfAirLine){
        this.flightsOfAirLineList.add(flightsOfAirLine);
    }

    public List<FlightsOfAirLine> getFlightsOfAirLineList() {
        return flightsOfAirLineList;
    }

    public void setFlightsOfAirLineList(List<FlightsOfAirLine> flightsOfAirLineList) {
        this.flightsOfAirLineList = flightsOfAirLineList;
    }

}
