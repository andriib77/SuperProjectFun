package AndriiVersionAirportProject.booking;

import java.util.UUID;

public class Passenger {

    private UUID idClient;
    private String name;

    private String seatNumber;
    private boolean isCheckedIn;
    private boolean hasBaggage;
    private boolean specialMeal;

    public Passenger(String name, String seatNumber) {
        this.idClient = UUID.randomUUID();
        this.name = name;
        this.seatNumber = seatNumber;
        this.isCheckedIn = false;
        this.hasBaggage = false;
        this.specialMeal = false;
    }

    // Геттеры и сеттеры для атрибутов
    public UUID getUuid() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isCheckedIn() {
        return isCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        isCheckedIn = checkedIn;
    }

    public boolean isHasBaggage() {
        return hasBaggage;
    }

    public void setHasBaggage(boolean hasBaggage) {
        this.hasBaggage = hasBaggage;
    }

    public boolean isSpecialMeal() {
        return specialMeal;
    }

    public void setSpecialMeal(boolean specialMeal) {
        this.specialMeal = specialMeal;
    }

    // Метод для отображения информации о пассажире

    @Override
    public String toString() {
        return "Passenger{" +
                "idClient=" + idClient +
                ", name='" + name + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", isCheckedIn=" + isCheckedIn +
                ", hasBaggage=" + hasBaggage +
                ", specialMeal=" + specialMeal +
                '}';
    }
}

