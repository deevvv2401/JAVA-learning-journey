// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.*;

public class GCDOf2Numbers {

    public static int  min(int a,int b){
        if(a>b)  return b;
        else   return a;   
    }
    public static void GDC(int a,int b){

        for(int i=min(a, b);i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.print("The GCD is: " + i);
                break;
            } 
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        GDC(a, b);
        sc.close();
    }
}
