package questionThree;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        StoreClerk clerk1 = new StoreClerk();
        Parcel parcel1 = new Parcel();

        System.out.print("Enter first name: ");
        clerk1.setFirstName(read.nextLine());
        System.out.print("Enter last name: ");
        clerk1.setLastName(read.nextLine());
        System.out.print("Enter clerk ID: ");
        clerk1.setStoreClerkID(read.nextInt());
        System.out.print("Enter package weight in kg: ");
        parcel1.setWeight(read.nextDouble());
        System.out.println("Cost: $" + parcel1.calCost(parcel1.getWeight()));
    }
}
