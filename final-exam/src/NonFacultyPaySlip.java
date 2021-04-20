public class NonFacultyPaySlip extends EmployeePaySlip {
    // Constant
    private static final int NON_FACULTY_HOURS = 160;

    // Static variable
    private static int numNonFaculty = 0;

    // Instance variables
    private double monthlySalary;

    public NonFacultyPaySlip() {
        numNonFaculty++;
    }

    public NonFacultyPaySlip(Employee employee) {
        super(employee);
        numNonFaculty++;
    }

    public NonFacultyPaySlip(Employee employees, double monthlySalary) {
        super(employees);
        numNonFaculty++;
        this.monthlySalary = monthlySalary;
    }

    public static int getNumNonFaculty() {
        return numNonFaculty;
    }

    public static void setNumNonFaculty(int numNonFaculty) {
        NonFacultyPaySlip.numNonFaculty = numNonFaculty;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateGrossSalary() {
        double grossPay = 0.0;
        if (employee.getHours() > NON_FACULTY_HOURS) {
            grossPay = monthlySalary + (2 * (monthlySalary / NON_FACULTY_HOURS) * (employee.getHours() - NON_FACULTY_HOURS));
        } else if (employee.getHours() == NON_FACULTY_HOURS) {
            grossPay = monthlySalary;
        } else {
            grossPay = (monthlySalary / NON_FACULTY_HOURS) * employee.getHours();
        }
        return grossPay;
    }

    @Override
    public String toString() {
        return "NonFacultyPaySlip{" +
                "employee=" + employee +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
