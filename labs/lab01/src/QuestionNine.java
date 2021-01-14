import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {
        // Create a scanner
        Scanner read = new Scanner(System.in);

        // Prompt user for inputs
        System.out.print("Hi, what's your name? ");
        String name = read.next();
        System.out.println("Welcome to our show, " + name);

        System.out.print("How old are you? ");
        int age = read.nextInt();
        int new_age = age - 5;
        System.out.println("Hmmmm, you don't look a day over " + new_age);

        System.out.print("Tell me, " + name + ", where do you live? ");
        String location = read.next();
        System.out.println("Oh, I've heard " + location + " is a lovely place");
    }
}
