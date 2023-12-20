package OlgaVersionAirportProject.Old.airflightCompanies;


import java.util.ArrayList;
import java.util.EnumMap;

public class Staff {

        private EnumMap<StaffDepartment, ArrayList<Employee>> departmentEmployees;

        public Staff() {
            this.departmentEmployees = new EnumMap<>(StaffDepartment.class);
            initializeDepartments();
        }

        private void initializeDepartments() {
            for (StaffDepartment department : StaffDepartment.values()) {
                departmentEmployees.put(department, new ArrayList<>());
            }
        }

        public void addEmployee(Employee employee) {
            StaffDepartment department = employee.getStaffDepartments();
            departmentEmployees.get(department).add(employee);
        }
        public void removeEmployee(Employee employee) {
        StaffDepartment department = employee.getStaffDepartments();
        departmentEmployees.get(department).remove(employee);
        }
        public int getTotalEmployees() {
            int total = 0;
            for (ArrayList<Employee> employees : departmentEmployees.values()) {
                total += employees.size();
            }
            return total;
        }

        public int getTotalEmployeesInDepartment(StaffDepartment department) {
            return departmentEmployees.get(department).size();
        }

        public ArrayList<Employee> getEmployeesInDepartment(StaffDepartment department) {
            return departmentEmployees.get(department);
        }
        public EmployeeStatus getEmployeeStatus(Employee employee) {
        try {
            // Assuming there is a valid status string in the qualification field
            return EmployeeStatus.valueOf(employee.getQualification());
        } catch (IllegalArgumentException | NullPointerException e) {
            // If the status is not valid or null, default to ON_DUTY
            return EmployeeStatus.valueOf(null);
        }
        }


        public int getTotalStaffQuantity() {
            int totalStaff = 0;
            for (ArrayList<Employee> employees : departmentEmployees.values()) {
                totalStaff += employees.size();
            }
            return totalStaff;
        }

    }