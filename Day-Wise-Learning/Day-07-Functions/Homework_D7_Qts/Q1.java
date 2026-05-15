package Homework_D7_Qts;
import java.util.*;

public class Q1 {

    public static int CheckPrime(int n) {
        if(n<= 1){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();


        if(CheckPrime(num)==1){
            System.out.println(num+" is a PRIME number.");
        }   else{
            System.out.println(num+" is NOT a PRIME number.");
        }

        sc.close();
    }    
}
