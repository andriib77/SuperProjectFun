package spf.airlines.service.bagagge;

public enum BaggageStatus {
    NOT_CHECKED("Not Checked"), // Не проверен
    CHECKED("Checked"),         // Проверен
    LOADED("Loaded");           // Загружен

    private final String status;

    BaggageStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }

}