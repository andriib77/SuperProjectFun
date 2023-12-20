package OlgaVersionAirportProject.Old.airflightCompanies;

public class Employee {
    private StaffDepartment staffDepartment;
    private String name;
    private int age;
    private String position;
    private String qualification;

    public Employee(StaffDepartment staffDepartment, String name, int age, String position, String qualification) {
        this.staffDepartment = staffDepartment;
        this.name = name;
        this.age = age;
        this.position = position;
        this.qualification = qualification;
    }

    public StaffDepartment getStaffDepartments() {
        return staffDepartment;
    }

    public void setStaffDepartments(StaffDepartment staffDepartments) {
        this.staffDepartment = staffDepartments;
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

    @Override
    public String toString() {
        return "Employee{" +
                "staffDepartment=" + staffDepartment +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }



}
