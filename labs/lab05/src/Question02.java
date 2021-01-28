import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final int ARRAY_LENGTH = 5;
        double[] array = new double[ARRAY_LENGTH];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = read.nextDouble();
        }

        // Print all numbers
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        double smallestNum = smallestNumber(array);
        System.out.println("The smallest number is " + smallestNum);

    }

    public static double smallestNumber(double[] array) {
        double smallestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNum) {
                smallestNum = array[i];
            }
        }
        return smallestNum;
    }
}
