package Task30thJan;

import java.util.Scanner;

public class Gradecalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Your grade is: A+");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Your grade is: A");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Your grade is: B");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Your grade is: C");
        }else if (marks >= 50 && marks <= 59) {
            System.out.println("Your grade is: D");
        }else {
            System.out.println("Your grade is: F");
        }
    }
}
