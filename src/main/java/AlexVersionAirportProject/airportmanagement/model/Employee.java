package AlexVersionAirportProject.airportmanagement.model;

import java.util.Date;

public class Employee {

    private String firstName;

    private String lastName;

    private int age;

    private Date hireDate;

    private String department;

    private String position;

    private double salary;

    private int vacationDays;

    private int sickLeaveDays;

    public Employee(String firstName, String lastName, int age, Date hireDate, String department,
                    String position, double salary, int vacationDays, int sickLeaveDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.vacationDays = vacationDays;
        this.sickLeaveDays = sickLeaveDays;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    @Override
    public String toString() {
        return "Employee: " +
                "\nFirstName     - " + firstName +
                "\nLastName      - " + lastName +
                "\nAge           - " + age +
                "\nHireDate      - " + hireDate +
                "\nDepartment    - " + department +
                "\nPosition      - " + position +
                "\nSalary        - " + salary +
                "\nVacationDays  - " + vacationDays +
                "\nSickLeaveDays - " + sickLeaveDays;
    }
}
