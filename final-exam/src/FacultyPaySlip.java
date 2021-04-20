public class FacultyPaySlip extends EmployeePaySlip {
    // Constants
    private static final int MASTERS_SALARY_PER_HOUR = 175;
    private static final int MASTERS_TEACHING_ALLOWANCE = 1500;
    private static final int BACHELORS_SALARY_PER_HOUR = 100;
    private static final int BACHELORS_TEACHING_ALLOWANCE = 600;

    // Static variable
    private static int numFaculty = 0;

    // Instance variable
    private char qualificationCode;

    public FacultyPaySlip() {
        numFaculty++;
    }

    public FacultyPaySlip(Employee employee) {
        super(employee);
        numFaculty++;
    }

    public FacultyPaySlip(Employee employees, char qualificationCode) {
        super(employees);
        numFaculty++;
        this.qualificationCode = qualificationCode;
    }

    public static int getNumFaculty() {
        return numFaculty;
    }

    public static void setNumFaculty(int numFaculty) {
        FacultyPaySlip.numFaculty = numFaculty;
    }

    public char getQualificationCode() {
        return qualificationCode;
    }

    public void setQualificationCode(char qualificationCode) {
        this.qualificationCode = qualificationCode;
    }

    @Override
    public double calculateGrossSalary() {
        double grossPay = 0.0;
        if (qualificationCode == Character.toUpperCase('M')) {
            grossPay = (employee.getHours() * MASTERS_SALARY_PER_HOUR) + MASTERS_TEACHING_ALLOWANCE;
        } else if (qualificationCode == Character.toUpperCase('B')) {
            grossPay = (employee.getHours() * BACHELORS_SALARY_PER_HOUR) + BACHELORS_TEACHING_ALLOWANCE;
        }
        return grossPay;
    }

    @Override
    public String toString() {
        return "FacultyPaySlip{" +
                "employee=" + employee +
                ", qualificationCode=" + qualificationCode +
                '}';
    }
}
