import java.util.ArrayList;

public abstract class EmployeePaySlip {
    // Constants
    protected static final double CANADIAN_INCOME_TAX = 0.25;
    protected static final int TAX_FREE_ALLOWANCE = 2500;
    protected static final int SURCHARGE_LIMIT = 3000;
    protected static final double SURCHARGE_FEE_1 = 33.0;
    protected static final double SURCHARGE_FEE_2 = 19.20;

    // Instance variable
    protected Employee employee;

    public EmployeePaySlip() {
    }

    public EmployeePaySlip(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployees(Employee employees) {
        this.employee = employees;
    }

    public abstract double calculateGrossSalary();

    public double calculateDeductions() {
        double deductions = 0.0;
        if (calculateGrossSalary() >= TAX_FREE_ALLOWANCE) {
            deductions += (CANADIAN_INCOME_TAX * (calculateGrossSalary() - TAX_FREE_ALLOWANCE));
        }
        if (calculateGrossSalary() > SURCHARGE_LIMIT) {
            deductions += SURCHARGE_FEE_1;
        } else {
            deductions += SURCHARGE_FEE_2;
        }
        return deductions;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }

    @Override
    public String toString() {
        return "EmployeePaySlip{" +
                "employees=" + employee +
                '}';
    }
}
