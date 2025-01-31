package Task31stJan;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int temp=number;
        int reminder=0;
        int newNumber=0;
        while(number>0){
            reminder =number%10;
            newNumber = newNumber + reminder*reminder*reminder;
            number = number/10;
        }

        //System.out.println(newNumber);

        if(temp==newNumber){
            System.out.println("It is armstrong");
        }
        else System.out.println("It is not");
    }

}
