public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private char employeeType;
    private String department;
    private double hours;

    // Static variable
    private static int numEmployees = 0;

    public Employee() {
        numEmployees++;
    }

    public Employee(String employeeID, String firstName, String lastName, char employeeType, String department, double hours) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeType = employeeType;
        this.department = department;
        this.hours = hours;
        numEmployees++;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
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

    public char getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(char employeeType) {
        this.employeeType = employeeType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public static int getNumEmployees() {
        return numEmployees;
    }

    public static void setNumEmployees(int numEmployees) {
        Employee.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeType=" + employeeType +
                ", department='" + department + '\'' +
                ", hours=" + hours +
                '}';
    }
}
