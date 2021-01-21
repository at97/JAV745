import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age < 16) {
            System.out.println("You must stop here!");
        }
        else {
            System.out.println("Access denied!");
        }
    }
}
