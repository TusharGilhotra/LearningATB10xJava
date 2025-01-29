package Task29thJan;
import java.util.*;

public class PositiveNegative {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);

        int inputA = sc.nextInt();

        if(inputA >= 0 ){
            System.out.println("positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
