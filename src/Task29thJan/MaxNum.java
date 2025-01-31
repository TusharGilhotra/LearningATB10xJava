package Task29thJan;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();

        if (Num1 > Num2) {
            System.out.println(Num1);
        } else {
            System.out.println(Num2);
        }
    }
}
