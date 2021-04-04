import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Please enter a number");
            int age = read.nextInt();
            if (checkAge(age)) {
                System.out.println("Valid age");
            }

        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static Boolean checkAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("You cannot be younger than 0 years old");
        } else if (age > 130) {
            throw new AgeException("You cannot be that old");
        } else {
            return true;
        }
    }


}
