package OlgaVersionAirportProject.OlgaVersionAirportProject.airLines.airCrafts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirCraftPark {
        private List<Aircraft> allAircrafts;
        private Map<TypeOfAircraft, List<Aircraft>> categorizedAircrafts;

        public AirCraftPark() {
            this.allAircrafts = new ArrayList<>();
            this.categorizedAircrafts = new HashMap<>();
            initializeCategorizedAircraftMap();
        }

        private void initializeCategorizedAircraftMap() {
            for (TypeOfAircraft type : TypeOfAircraft.values()) {
                categorizedAircrafts.put(type, new ArrayList<>());
            }
        }


        public void addAircraft (Aircraft aircraft){
            allAircrafts.add(aircraft);
            categorizedAircrafts.get(aircraft.getTypeOfAircraft()).add(aircraft);
        }

        public void removeAircraft (Aircraft aircraft){
        allAircrafts.remove(aircraft);
        categorizedAircrafts.get(aircraft.getTypeOfAircraft()).remove(aircraft);
        }
        public List<Aircraft>getAllAircrafts(TypeOfAircraft typeOfAircraft){
            return categorizedAircrafts.get(typeOfAircraft);
        }

    public Map<TypeOfAircraft, List<Aircraft>> getCategorizedAircrafts() {
        return categorizedAircrafts;
    }
}