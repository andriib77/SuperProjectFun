package CleanCodeSFP.airLines.staffOfAirLine;/*package Airport.OlgaVersionAirportProject.airLines.staffOfAirLine;

public class StaffFlightCompanyTest {
 /*   public static void main(String[] args) {
        // Create staff instance
        Staff staff = new Staff();

        // Create employees in different departments
        Employee director = new Employee(StaffDepartment.MANAGEMENT, "Jane Doe",
                45,"Director", "MBA");
        Employee accountant = new Employee(StaffDepartment.ACCOUNTANT,
                "John Smith", 35, "Accountant",
                "Accounting Degree");
        Employee pilot = new Employee(StaffDepartment.CREW_TEAM,
                "Captain Johnson", 50, "Pilot",
                "Commercial Pilot License");
        Employee technician = new Employee(StaffDepartment.TECHNIQUES,
                "Jack Robinson", 35, "Technician",
                "Aircraft Maintenance License");
        Employee security = new Employee(StaffDepartment.SECURITY,
                "Michael Brown", 40, "Security Officer",
                "Security Management Degree");

        // Add employees to the staff
        staff.addEmployee(director);
        staff.addEmployee(accountant);
        staff.addEmployee(pilot);
        staff.addEmployee(technician);
        staff.addEmployee(security);

        // Test total staff quantity
        System.out.println("Total Staff Quantity: " + staff.getTotalStaffQuantity());

        // Test total employees in a specific department
        System.out.println("Total Technicians: "
                + staff.getTotalEmployeesInDepartment(StaffDepartment.TECHNIQUES));

        // Test employees in a specific department
        System.out.println("Technicians: "
                + staff.getEmployeesInDepartment(StaffDepartment.TECHNIQUES));

        // Test remove employee
        staff.removeEmployee(pilot);

        // Test total staff quantity after removing an employee
        System.out.println("Total Staff Quantity after removing a pilot: "
                + staff.getTotalStaffQuantity());

        // Test employee status
        System.out.println("Status of Director: "
                + staff.getEmployeeStatus(director));*/

 /*   public static void main(String[] args) {
        // Create staff instance
        StaffOperations staff = new StaffOperations();

        // Create employees in different departments
        Employee director = new Employee(StaffDepartment.MANAGEMENT, "Jane Doe", 45, "Director", "MBA");
        Employee accountant = new Employee(StaffDepartment.ACCOUNTANT, "John Smith", 35, "Accountant", "Accounting Degree");
        Employee pilot = new Employee(StaffDepartment.CREW_TEAM, "Captain Johnson", 50, "Pilot", "ON_DUTY");
        Employee technician = new Employee(StaffDepartment.TECHNIQUES, "Jack Robinson", 35, "Technician", "Aircraft Maintenance License");
        Employee security = new Employee(StaffDepartment.SECURITY, "Michael Brown", 40, "Security Officer", "Security Management Degree");

        // Add employees to the staff
        staff.addEmployee(director);
        staff.addEmployee(accountant);
        staff.addEmployee(pilot);
        staff.addEmployee(technician);
        staff.addEmployee(security);

        // Test total staff quantity
        System.out.println("Total Staff Quantity: " + staff.getTotalStaffQuantity());

        // Test total employees in a specific department
        System.out.println("Total Technicians: " + staff.getTotalEmployeesInDepartment(StaffDepartment.TECHNIQUES));

        // Test employees in a specific department
        System.out.println("Technicians: " + staff.getEmployeesInDepartment(StaffDepartment.TECHNIQUES));

        // Test remove employee
        staff.removeEmployee(pilot);

        // Test total staff quantity after removing an employee
        System.out.println("Total Staff Quantity after removing a pilot: " + staff.getTotalStaffQuantity());

      /*  // Test employee status
        System.out.println("Status of Director: " + staff.getEmployeeStatus(director));
        System.out.println("Status of Pilot: " + staff.getEmployeeStatus(pilot)); // The pilot is ON_DUTY
    }*/
