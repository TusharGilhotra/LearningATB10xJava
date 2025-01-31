package Task30thJan;
import java.util.Scanner;

public class CheckAlphabet {
        public static void main(String[] args) {

            int Bal = 10000;


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            int wd = sc.nextInt();


            if (wd <= 0) {
                System.out.println("Error: amount must be greater than zero.");
            } else if (wd % 100 != 0) {
                System.out.println("Error: Amount should be a multiple of 100.");
            } else if (wd > Bal) {
                System.out.println("Error: Insufficient balance.");
            } else {

                Bal = Bal - wd;
                System.out.println("Successful!");
                System.out.println("Updated Balance: " + Bal);
            }
        }
    }

