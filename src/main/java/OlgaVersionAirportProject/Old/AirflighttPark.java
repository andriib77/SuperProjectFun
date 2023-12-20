package OlgaVersionAirportProject.Old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirflighttPark {
        private List<Airflight> allAircrafts;
        private Map<TypeOfAircraft, List<Airflight>> categorizedAircrafts;

        public AirflighttPark() {
            this.allAircrafts = new ArrayList<>();
            this.categorizedAircrafts = new HashMap<>();
            initializeCategorizedAircraftMap();
        }

        private void initializeCategorizedAircraftMap() {
            for (TypeOfAircraft type : TypeOfAircraft.values()) {
                categorizedAircrafts.put(type, new ArrayList<>());
            }
        }
        public void addAircraft (Airflight aircraft){
            allAircrafts.add(aircraft);
            categorizedAircrafts.get(aircraft.getTypeOfAircraft()).add(aircraft);
        }

        public void removeAircraft (Airflight aircraft){
        allAircrafts.remove(aircraft);
        categorizedAircrafts.get(aircraft.getTypeOfAircraft()).remove(aircraft);
        }
        public List<Airflight>getAllAircrafts(TypeOfAircraft typeOfAircraft){
            return categorizedAircrafts.get(typeOfAircraft);
        }

    public Map<TypeOfAircraft, List<Airflight>> getCategorizedAircrafts() {
        return categorizedAircrafts;
    }
}