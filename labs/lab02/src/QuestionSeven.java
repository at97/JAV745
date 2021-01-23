import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Constants
        final int AGE_LIMIT = 22;
        final int MINIMUM_CARS = 0;

        // Prompt user for inputs
        System.out.print("Hi, what's your name? ");
        String name = "";
        name += read.nextLine();
        System.out.println("Welcome to our show, " + name);

        System.out.print("How old are you? ");
        int age = read.nextInt();
        int complimentAge = age - 5;

        if (age > AGE_LIMIT) {
            System.out.println("Hmmmm, you don't look a day over " + complimentAge + ".");
            System.out.print("Tell me, " + name + ", how many cars do you own? ");
            int numCars = read.nextInt();
            // Read the leftover new line
            read.nextLine();

            if (numCars > MINIMUM_CARS) {
                System.out.print(name + ", what is the brand model of your car? Input: ");
                String car = "";
                car += read.nextLine();
                System.out.println(car + " is a great choice for a car.\n" + name + ", have a great day. Good bye!");
            } else {
                System.out.println("Wow, come on now " + name + ", you are " + age + " and don't own a car?!");
            }
        } else {
            System.out.println("Sorry, you don't meet the minimum required age to continue.");
        }
    }
}
