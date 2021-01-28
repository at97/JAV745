import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = read.nextDouble();
        }
        double sum = sum(array);
        System.out.println("Sum: " + sum);
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
