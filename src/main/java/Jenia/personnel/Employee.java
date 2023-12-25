package Jenia.personnel;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private String vacation;
    private int workingHours;
    private double hourlyRate;
    private int vacationDays;
    private int sickLeaveDays;

    public Employee(String employeeId, String firstName, String lastName, String department,
                    int workingHours, double hourlyRate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.vacation = vacation;
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
        this.vacationDays = 0;
        this.sickLeaveDays = 0;
    }

    // Геттеры и сеттеры для атрибутов

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getSickLeaveDays() {
        return sickLeaveDays;
    }

    public void setSickLeaveDays(int sickLeaveDays) {
        this.sickLeaveDays = sickLeaveDays;
    }

    // Метод для отображения информации о сотруднике
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", workingHours=" + workingHours +
                ", hourlyRate=" + hourlyRate +
                ", vacationDays=" + vacationDays +
                ", sickLeaveDays=" + sickLeaveDays +
                '}';
    }
    //TODO Create file "Working Schedule" for personnel
}
