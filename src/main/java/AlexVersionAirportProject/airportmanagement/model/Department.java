package AlexVersionAirportProject.airportmanagement.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String title;

    private String managerOfDepartment;

    private List<Employee> employeesList;

    public Department(String title, String managerOfDepartment) {
        this.title = title;
        this.managerOfDepartment = managerOfDepartment;
        this.employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
            if (employeesList.contains(employee)) {
                //LOGGER.warn("Attempt to add an already present employee to the list! Employee {} {}.", employee.getFirstName(), employee.getLastName());
            } else {
                employeesList.add(employee);
                //LOGGER.info("New employee added into the list! Employee {} {}.", employee.getFirstName(), employee.getLastName())");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManagerOfDepartment() {
        return managerOfDepartment;
    }

    public void setManagerOfDepartment(String managerOfDepartment) {
        this.managerOfDepartment = managerOfDepartment;
    }

    public List<Employee> getEmployeesList() {
        return new ArrayList<>(employeesList);
    }

    public void setEmployees(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public String toString() {
        return "Department: " +
                "\nTitle               - " + title +
                "\nManagerOfDepartment - " + managerOfDepartment +
                "\nEmployees           : " + employeesList;
    }
}
