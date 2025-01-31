package Task31stJan;
import java.util.*;

public class LoanEligibilty { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter Age: ");
    int age = scanner.nextInt();

    System.out.print("Enter Salary: ");
    double salary = scanner.nextDouble();

    System.out.print("Enter Credit Score: ");
    int creditScore = scanner.nextInt();



    if (age <= 0) {
        System.out.println("Age cannot be negative integer.");
    } else if (age < 18) {
        System.out.println("Minimum age is 18.");
    } else if (age > 80) {
        System.out.println("Maximum age is 80.");
    }


    if (salary <= 0) {
        System.out.println("Salary must be a positive number.");
    } else if (salary < 30000) {
        System.out.println("Minimum salary is 30,000");
    }

    if (creditScore <= 0) {
        System.out.println("Credit score must be positive");
    } else if (creditScore < 650) {
        System.out.println("Minimum credit score requirement is 650");
    } else if (creditScore > 850) {
        System.out.println("Maximum credit score limit is 850.");
    }

    if (age >= 18 && age <= 80 && salary >= 30000 && creditScore >= 650 && creditScore <= 850) {
        System.out.println("eligible");
    } else {
        System.out.println("Not eligible");
    }
}
}
