import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the grade for test 1: ");
        double test1 = input.nextDouble();
        System.out.print("Enter the grade for test 2: ");
        double test2 = input.nextDouble();
        System.out.print("Enter the grade for test 3: ");
        double test3 = input.nextDouble();

        double average = (test1 + test2 + test3) / 3;

        if(average >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
