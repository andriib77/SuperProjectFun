package spf.airlines.staffOfAirLine;

import java.util.Date;

public class Employee {
    //private NameOfAirLine.getNameOfAirLine;
    private StaffDepartment staffDepartment;
    private String name;
    private int age;
    private String position;
    private String qualification;
    private Date startOfWork;
    private Date endOfWork;
    private Date scedule;
    double Salary;
    double additionalRewards;

    public Employee(StaffDepartment staffDepartment, String name, int age, String position, String qualification,
                    Date startOfWork, Date endOfWork, Date scedule, double salary, double additionalRewards) {
        this.staffDepartment = staffDepartment;
        this.name = name;
        this.age = age;
        this.position = position;
        this.qualification = qualification;
        this.startOfWork = startOfWork;
        this.endOfWork = endOfWork;
        this.scedule = scedule;
        Salary = salary;
        this.additionalRewards = additionalRewards;
    }

    public StaffDepartment getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(StaffDepartment staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getStartOfWork() {
        return startOfWork;
    }

    public void setStartOfWork(Date startOfWork) {
        this.startOfWork = startOfWork;
    }

    public Date getEndOfWork() {
        return endOfWork;
    }

    public void setEndOfWork(Date endOfWork) {
        this.endOfWork = endOfWork;
    }

    public Date getScedule() {
        return scedule;
    }

    public void setScedule(Date scedule) {
        this.scedule = scedule;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getAdditionalRewards() {
        return additionalRewards;
    }

    public void setAdditionalRewards(double additionalRewards) {
        this.additionalRewards = additionalRewards;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "staffDepartment=" + staffDepartment +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", qualification='" + qualification + '\'' +
                ", startOfWork=" + startOfWork +
                ", endOfWork=" + endOfWork +
                ", scedule=" + scedule +
                ", Salary=" + Salary +
                ", additionalRewards=" + additionalRewards +
                '}';
    }
}
