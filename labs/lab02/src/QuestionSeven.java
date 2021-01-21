import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Hi, what's your name? ");
        String name = "";
        name += read.nextLine();
        System.out.println("Welcome to our show, " + name);

        System.out.print("How old are you? ");
        int age = read.nextInt();
        System.out.println("Hmmmm, you don't look a day over " + age + ".");

        if (age > 22) {
            System.out.print("Tell me, " + name + ", how many cars do you own? ");
            int numCars = read.nextInt();
            // Read the leftover new line
            read.nextLine();

            if (numCars > 0) {
                System.out.print(name + ", what is the brand model of your car? Input: ");
                String car = "";
                car += read.nextLine();
                System.out.println(car + " is a great choice for a car.\n" + name + ", have a great day. Good bye!");
            } else {
                System.out.println("Wow, come on now " + name + ", you are " + age + " and do not own a car!");
            }

        }
    }
}
