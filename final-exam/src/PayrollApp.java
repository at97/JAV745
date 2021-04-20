import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PayrollApp {
    private static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        // Employees database
        ArrayList<Employee> employees = new ArrayList<>();
        // Pay slip database
        ArrayList<EmployeePaySlip> paySlipDatabase = new ArrayList<>();
        System.out.println("ABC College Payroll Calculator");

        boolean valid = false;
        while (!valid) {
            try {
                // Get employee ID
                String employeeID = getEmployeeID();
                // Ask for employee first name
                System.out.print("Enter first name: ");
                String firstName = getName();
                // Ask for employee last name
                System.out.print("Enter last name: ");
                String lastName = getName();
                // Ask for employee department
                String department = getDepartment();
                // Ask for hours worked
                double hours = getHours();
                // Ask for employee type
                char employeeType = getEmployeeType();
                // Add employee to arraylist
                Employee newEmployee = new Employee(employeeID, firstName, lastName, employeeType, department, hours);
                employees.add(newEmployee);
                // Ask if faculty employee has a master's or bachelor's degree
                if (employeeType == 'F') {
                    char degreeType = getDegreeType();
                    FacultyPaySlip newFacultyPaySlip = new FacultyPaySlip(newEmployee, degreeType);
                    paySlipDatabase.add(newFacultyPaySlip);
                }
                // Ask for non-faculty's monthly salary
                if (employeeType == 'N') {
                    double monthlySalary = getMonthlySalary();
                    NonFacultyPaySlip newNonFacultyPaySlip = new NonFacultyPaySlip(newEmployee, monthlySalary);
                    paySlipDatabase.add(newNonFacultyPaySlip);
                }
                // Ask to add more employees
                char addMore = addMoreEmployees();
                if (addMore == 'N') {
                    valid = true;
                }
                read.nextLine();
            } catch (Exception e) {
                System.out.println("Error: Invalid input. ");
            }
        }

        // Display pay slip report
        paySlipReport(paySlipDatabase);
        // Generate pay slip report file
        writePaySlipReportToFile(paySlipDatabase);
    }

    public static String getEmployeeID () {
        String employeeID = null;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter employee ID: ");
                employeeID = read.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println("Error: Invalid employee ID. ");
            }
        }
        return employeeID;
    }

    public static String getName() {
        String name = null;
        boolean valid = false;
        while (!valid) {
            try {
                name = read.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println("Error: Invalid name. Try again: ");
            }
        }
        return name;
    }

    public static String getDepartment() {
        String department = null;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter employee department: ");
                department = read.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println("Error: Invalid department. ");
            }
        }
        return department;
    }

    public static double getHours() {
        double hours = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter hours worked: ");
                hours = read.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print("Error: Invalid input. ");
                read.nextLine();
            }
        }
        return hours;
    }

    public static char getEmployeeType() {
        char employeeType = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter employee type - 'F' for \"faculty\" or 'N' for \"non-faculty\": ");
                employeeType = read.next().charAt(0);
                employeeType = Character.toUpperCase(employeeType);
                if (employeeType == 'F' || employeeType == 'N') {
                    valid = true;
                } else {
                    System.out.println("Invalid employee type.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid employee type. ");
            }
        }
        return employeeType;
    }

    public static char getDegreeType() {
        char degreeType = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter degree type - 'M' for \"master's degree\" or 'B' for \"bachelor's degree\": ");
                degreeType = read.next().charAt(0);
                degreeType = Character.toUpperCase(degreeType);
                if (degreeType == 'B' || degreeType == 'M') {
                    valid = true;
                } else {
                    System.out.println("Invalid degree type.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid degree type. ");
            }
        }
        return degreeType;
    }

    public static double getMonthlySalary() {
        double monthlySalary = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter monthly salary: $");
                monthlySalary = read.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid number. ");
                read.nextLine();
            }
        }
        return monthlySalary;
    }

    public static char addMoreEmployees() {
        char response = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Would you like to add more employees? Enter 'Y' for \"yes\" or 'N' for \"no\": ");
                response = read.next().charAt(0);
                response = Character.toUpperCase(response);
                if (response == 'Y' || response == 'N') {
                    valid = true;
                } else {
                    System.out.println("Invalid employee type.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid employee type. ");
            }
        }
        return response;
    }

    public static void paySlipReport(ArrayList<EmployeePaySlip> paySlip) {
        for (int i = 0; i < paySlip.size(); i++) {
            System.out.println("----------Employee " + (i + 1) + "----------");
            System.out.println("Employee ID: " + paySlip.get(i).getEmployee().getEmployeeID());
            System.out.println("Employee name: " + paySlip.get(i).getEmployee().getFirstName() + " " + paySlip.get(i).getEmployee().getLastName());
            System.out.println("Employee department: " + paySlip.get(i).getEmployee().getDepartment());
            if (paySlip.get(i).getEmployee().getEmployeeType() == 'F') {
                System.out.println("Employee type: Faculty");
                // Cast EmployeePaySlip to FacultyPaySlip
                if (((FacultyPaySlip)paySlip.get(i)).getQualificationCode() == 'M') {
                    System.out.println("Employee degree type: Master's degree");
                }
                if (((FacultyPaySlip)paySlip.get(i)).getQualificationCode() == 'B') {
                    System.out.println("Employee degree type: Bachelor's degree");
                }
            } else if (paySlip.get(i).getEmployee().getEmployeeType() == 'N') {
                System.out.println("Employee type: Non-faculty");
                System.out.println("Monthly salary: $" + ((NonFacultyPaySlip)paySlip.get(i)).getMonthlySalary());
            }
            System.out.println("Hours worked: " + paySlip.get(i).getEmployee().getHours());
            System.out.println("Gross salary: $" + paySlip.get(i).calculateGrossSalary());
            System.out.println("Deductions: $" + paySlip.get(i).calculateDeductions());
            System.out.println("Net salary: $" + paySlip.get(i).calculateNetSalary());
            System.out.println("");
        }
        System.out.println("------------------------------");
        System.out.println("Processed employees: " + Employee.getNumEmployees());
        System.out.println("Total number of faculty: " + FacultyPaySlip.getNumFaculty());
        System.out.println("Total number of non-faculty: " + NonFacultyPaySlip.getNumNonFaculty());
    }

    public static void writePaySlipReportToFile(ArrayList<EmployeePaySlip> paySlip) {
        try {
            // Output to file
            BufferedWriter output = new BufferedWriter(new FileWriter("PaySlipReport.txt"));
            for (int i = 0; i < paySlip.size(); i++) {
                output.write("----------Employee " + (i + 1) + "----------\n");
                output.write("Employee ID: " + paySlip.get(i).getEmployee().getEmployeeID() + "\n");
                output.write("Employee name: " + paySlip.get(i).getEmployee().getFirstName() + " " + paySlip.get(i).getEmployee().getLastName() + "\n");
                output.write("Employee department: " + paySlip.get(i).getEmployee().getDepartment() + "\n");
                if (paySlip.get(i).getEmployee().getEmployeeType() == 'F') {
                    output.write("Employee type: Faculty\n");
                    // Cast EmployeePaySlip to FacultyPaySlip
                    if (((FacultyPaySlip)paySlip.get(i)).getQualificationCode() == 'M') {
                        output.write("Employee degree type: Master's degree\n");
                    }
                    if (((FacultyPaySlip)paySlip.get(i)).getQualificationCode() == 'B') {
                        output.write("Employee degree type: Bachelor's degree\n");
                    }
                } else if (paySlip.get(i).getEmployee().getEmployeeType() == 'N') {
                    output.write("Employee type: Non-faculty\n");
                    output.write("Monthly salary: $" + ((NonFacultyPaySlip)paySlip.get(i)).getMonthlySalary() + "\n");
                }
                output.write("Hours worked: " + paySlip.get(i).getEmployee().getHours() + "\n");
                output.write("Gross salary: $" + paySlip.get(i).calculateGrossSalary() + "\n");
                output.write("Deductions: $" + paySlip.get(i).calculateDeductions() + "\n");
                output.write("Net salary: $" + paySlip.get(i).calculateNetSalary() + "\n");
                output.write("\n");
            }
            output.write("------------------------------\n");
            output.write("Processed employees: " + Employee.getNumEmployees() + "\n");
            output.write("Total number of faculty: " + FacultyPaySlip.getNumFaculty() + "\n");
            output.write("Total number of non-faculty: " + NonFacultyPaySlip.getNumNonFaculty() + "\n");
            output.close();
            System.out.println("Pay slip report written to PaySlipReport.txt");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
