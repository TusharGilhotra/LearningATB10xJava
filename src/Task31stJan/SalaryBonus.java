package Task31stJan;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Salary:");
    double salary = sc.nextDouble();
    System.out.print("Enter Exp:");
    int Exp = sc.nextInt();
    double bonus = 0;
    if (Exp < 1) {
        bonus = 0;
    }
    else if (Exp >= 1 && Exp <= 3) {
        bonus = salary * 0.05;
    }
    else if (Exp >= 4 && Exp <= 6) {
        bonus = salary * 0.10;
    }
    else if (Exp > 6) {
        bonus = salary * 0.15;
    }

    System.out.println("Bonus is" + bonus);
}
}
