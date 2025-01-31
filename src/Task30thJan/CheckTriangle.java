package Task30thJan;
import java.util.Scanner;

public class CheckTriangle {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // Check if the sides form a valid triangle
            if ((a + b > c) && (a + c > b) && (b + c > a)) {
                System.out.println("valid triangle.");
            } else {
                System.out.println("Not a valid triangle.");
            }
        }
    }

