package Task31stJan;

import java.util.Scanner;

public class TravelEligible {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Age: ");
    int age = sc.nextInt();

        System.out.print("Enter Visa Status(true or false): ");
        boolean visastatus = sc.nextBoolean();

    if (age < 0) {
        System.out.println("Age must be positive");
    }
    else if (age >= 18 && visastatus) {
        System.out.println("eligible to travel.");
    }
    else {
        System.out.println("not eligible to travel.");
    }
}
}
