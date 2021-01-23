public class Question01 {
    public static void main(String[] args) {
        // Declare constant
        final int LIMIT = 10;

        System.out.println("For loop:");
        for (int i = 0; i < 10; i++) {
            System.out.println("I love programming.");
        }
        System.out.println("\nWhile loop:");
        int counter = 0;
        while (counter < LIMIT) {
            System.out.println("I love programming.");
            counter++;
        }
    }
}
