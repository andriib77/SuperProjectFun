package OlgaVersionAirportProject.airLines.airLine;

import OlgaVersionAirportProject.airLines.airCrafts.TypeOfAircraft;
import OlgaVersionAirportProject.airLines.flights.TypeOfFlights;
import OlgaVersionAirportProject.airLines.service.ServiceOfAirLine;

import java.util.ArrayList;
import java.util.List;

public class AirLinesOfAirport {

public List<EveryAirLine> airLineList;

        public AirLinesOfAirport(List<EveryAirLine> airLineList) {
                this.airLineList = new ArrayList<>();
        }



        EveryAirLine Lufthansa = new EveryAirLine( "LH","Lufthansa","Germany","International",1000,
                ServiceOfAirLine.PASSENGERS_CARGO_lITERAL_SERVICE,100, TypeOfAircraft.ALL_TYPES, TypeOfFlights.ALL_TYPE_OF_FLIGHTS  );
        EveryAirLine AZAL = new EveryAirLine("J2", "AZAL", "Azerbaijan ","International", 500,
                ServiceOfAirLine.PASSENGERS_CARGO_lITERAL_SERVICE,50,TypeOfAircraft.PASSENGER,TypeOfFlights.CHARTER_PASSENGER_FLIGHT );




}
