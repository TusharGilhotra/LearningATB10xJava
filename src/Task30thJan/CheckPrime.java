package Task30thJan;
import java.util.*;

public class CheckPrime {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number to check
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            boolean a = true;

            if (num <= 1) {
                a = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        a = false;
                        break;
                    }
                }
            }
            if (a) {
                System.out.println("prime");
            } else {
                System.out.println("not a prime");
            }
        }
    }

