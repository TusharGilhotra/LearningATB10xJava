package Task30thJan;
import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        if(year % 100 == 0){
            if (year % 400 == 0)
                System.out.println("Leap year");
            else
                System.out.println("Not a Leap year");
        }
        else if(year%4==0){
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a leap year");

    }
}
