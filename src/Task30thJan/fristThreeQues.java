package Task30thJan;
import java.util.*;

public class fristThreeQues {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        // large among three

        if(a>=b && a>=c){
                System.out.println(a + "is largest");
        }
        else if(b>=c && b>=a){
            System.out.println(b + "is largest");
        }
        else if(c>=a && c>=b){
                System.out.println(c + "is largest");
        }


        //smallest of two amon a and b

        if (a>b){
            System.out.println(b + "is smallest");
        }
        else
            System.out.println(a+ "is smallest");

        // smallest of three

        if(a<=b && a<=c){
            System.out.println(a + "is smallest");
        }
        else if(b<=c && b<=a){
            System.out.println(b + "is smallest");
        }
        else if(c<=a && c<=b){
            System.out.println(c + "is smallest");
        }
    }
}
