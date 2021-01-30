import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //int code;
        //code = 18 / 6;
//        if(code==1){
//            System.out.println("Case 1 is executed");
//        }
//        else if (code==2){
//            System.out.println("Case 2 is executed");
//        }
//        else{
//            System.out.println("No case is executed");
//        }
//        switch (code) {
//            case 1:
//                System.out.println("Case 1 is executed");
//                break;
//            case 2:
//                System.out.println("Case 2 is executed");
//                break;
//            default:
//                System.out.println("No case is executed");
//        }

//        int num1 = 10;
//        int num2 = 24;
//        int num3 = 7;
//        boolean result1 = isPerfect(num1);
//        boolean result2 = isPerfect(num2);
//        boolean result3 = isPerfect(num3);
//        System.out.println("Result 1: " + result1);
//        System.out.println("Result 2: " + result2);
//        System.out.println("Result 3: " + result3);

//        int x = 5, y = 20;
//        x += 32;
//        y /= 4;
//        System.out.println("x = " + x + ", y = " + y);

//        int x = 578;
//        System.out.print("There are " +x + 5 + "\n hens in the hen house.");

//        int  anInt =  1 ;
//        for ( anInt =  0 ; anInt <  3 ; anInt++) {
//            System.out.println( "I love the for loop structure" );
//        }

//        double x = 100.1;
//        double y = 100.1;
//        boolean b = (x == y);
//        System.out.println(b);

//        Scanner read = new Scanner(System.in);
//        boolean exit = false;
//        System.out.println("Enter 1 for like or 0 for dislike: ");
//        System.out.println("Enter -1 to quit");
//        int input;
//        int temp;
//        int likes = 0;
//        int dislikes = 0;
//        int total = 0;
//        while (!exit) {
//            System.out.print("Enter a like/dislike: ");
//            temp = read.nextInt();
//            if (temp == 1) {
//                likes += 1;
//            } else if (temp == 0) {
//                dislikes += 1;
//            } else {
//                exit = true;
//            }
//        }
//        total = likes - dislikes;
//        System.out.println("Number of likes: " + likes);
//        System.out.println("Number of dislikes: " + dislikes);
//        System.out.println("Total earned: " + total);
//
//    }
    }

    public static boolean isPerfect(int num) {
        boolean result;
        int sum = 0;
        System.out.println("For " + num);

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.println("Sum: " + sum);
            }
        }

//        if (sum == num) {
//            result = true;
//        } else {
//            result = false;
//        }
//        return result;
//        methodA();
//        System.out.println("Test");

        int code;
        code = 9 / 6;
        if (code == 1) {
            System.out.println("Case 1 is executed");
        } else if (code == 2) {
            System.out.println("Case 2 is executed");
        } else {
            System.out.println("No case is executed");
        }
    }


    public static void methodA() {

        methodB();
    }

    public static void methodB() {

        methodC();
    }

    public static void methodC() {
        methodD();
        System.out.println("Test c");
    }

    public static void methodD() {
        System.out.println("D");
    }
}
