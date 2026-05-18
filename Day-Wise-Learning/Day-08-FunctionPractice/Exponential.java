// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;

public class Exponential {
    public static void Expo(int n,int x){
        
        for(int i= 2;i<= n;i++){
            x = x*x;
        }
        System.out.print("The required answer is: "+x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        System.out.print("Enter x: ");
        int x= sc.nextInt();

        Expo(n, x);

        sc.close();
    }
}
