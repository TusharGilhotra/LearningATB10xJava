package Task29thJan;
import java.util.*;
public class VowConso {


        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            char ch= sc.next().charAt(0);
            char ch1 =Character.toLowerCase(ch);
            if(ch1 =='a'|| ch1 =='e'|| ch1 =='i'|| ch1 =='o'|| ch1 =='u'){
                System.out.println("vowel");
            }else{
                System.out.println("consonent");
            }
        }
    }

