import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a number to sqaure: ");
        double num = read.nextDouble();

        // Invoke method
        double result = sqr(num);
        System.out.println(num + "^2" + " = " + result);
    }

    public static double sqr(double num) {
        double square = 0;
        square = num * num;
        return square;
    }
}