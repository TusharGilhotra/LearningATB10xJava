package Task31stJan;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int temp=number;
        int reminder =0;
        int newNumber = 0;
        while(number>0){
            reminder =number%10;
            newNumber = newNumber*10 + reminder;
            number = number/10;
        }
      //  System.out.println(newNumber);
        if(temp==newNumber){
            System.out.println("it is a palindrome number");
        }
        else
            System.out.println("It is not a palindrome number");
    }
}
