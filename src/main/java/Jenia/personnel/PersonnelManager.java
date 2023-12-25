package Jenia.personnel;

import java.util.ArrayList;
import java.util.List;

public class PersonnelManager {
    private List<Employee> employees;

    public PersonnelManager() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Метод для добавления нового сотрудника
    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для увольнения сотрудника
    public void fireEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
    }

    // Метод для составления графика работы
    public void createWorkSchedule(Employee employee, String schedule) {
        // Реализуйте логику составления графика работы для сотрудника
    }

    // Метод для отслеживания рабочих часов
    public void trackWorkingHours(Employee employee, int hoursWorked) {
        employee.setWorkingHours(employee.getWorkingHours() + hoursWorked);
    }

    // Метод для учета отпусков
    public void takeVacation(Employee employee, int vacationDays) {
        if (vacationDays <= employee.getVacationDays()) {
            employee.setVacationDays(employee.getVacationDays() - vacationDays);
        } else {
            System.out.println("Insufficient vacation days available for " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    // Метод для учета больничных
    public void takeSickLeave(Employee employee, int sickLeaveDays) {
        if (sickLeaveDays <= employee.getSickLeaveDays()) {
            employee.setSickLeaveDays(employee.getSickLeaveDays() - sickLeaveDays);
        } else {
            System.out.println("Insufficient sick leave days available for " + employee.getFirstName() + " " + employee.getLastName());
        }
    }

    // Метод для расчета заработной платы
    public double calculateSalary(Employee employee) {
        return employee.getWorkingHours() * employee.getHourlyRate();
    }

}
