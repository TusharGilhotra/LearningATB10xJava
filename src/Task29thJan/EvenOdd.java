package Task29thJan;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int Num1 = sc.nextInt();

        if(Num1%2 == 0 ){
            System.out.println("Even");
        }
        else{
                System.out.println("odd");
        }

    }
}
