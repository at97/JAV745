import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        final int ARRAY_LENGTH = 3;

        int[] array = new int[ARRAY_LENGTH];
        boolean valid = false;
        int num;
        for (int i = 0; i < array.length; i++) {
            while (!valid) {
                System.out.print("Enter positive integer: ");
                num = read.nextInt();
                //read.nextLine();
                if (num > 0) {
                    array[i] = num;
                    valid = true;
                } else {
                    System.out.println("Number must be a positive integer. Try again");
                }
            }
            valid = false;
        }

        for (int i = 0; i < array.length; i++) {
            int[] factors = new int[array[i]];
            factors = calculateFactors(array[i]);
            System.out.print("The factors of " + array[i] + " are: ");
            display(factors);
        }

    }

    public static int[] calculateFactors(int num) {
        int[] result = new int[num];

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    result[i - 1] = i;
                }
            }
        } else {
            System.out.println("Enter a positive integer");
        }
        return result;
    }

    public static void display(int[] factors) {
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0 && factors[i] != factors[factors.length - 1]) {
                System.out.print(factors[i] + ", ");
            } else if (factors[i] == factors[factors.length - 1]) {
                System.out.print(factors[i] + "\n");
            }
        }
    }
}
