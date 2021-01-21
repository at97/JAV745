import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if(age <= 18) {
            System.out.println("You are too young to go beyond this point");
        } else {
            System.out.println("You have been granted access");
            }
        }
    }

