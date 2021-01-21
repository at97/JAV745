import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter loan amount: ");
        double loan = input.nextDouble();
        double deposit = 0.0;

        if(loan < 25000) {
            deposit = 0.05 * loan;
            System.out.println("Deposit: " + deposit);
        } else if (loan <= 49999){
            deposit = 1250 + 0.1 * (loan - 25000);
            System.out.println("Deposit: " + deposit);
        } else if (loan <= 100000){
            deposit = 5000 + 0.25 * (loan - 50000);
            System.out.println("Deposit: " + deposit);
        } else {
            System.out.println("Not allowed");
        }
    }
}
