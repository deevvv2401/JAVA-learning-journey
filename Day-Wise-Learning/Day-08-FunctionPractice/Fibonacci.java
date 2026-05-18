// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 

import java.util.*;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
    
        int first=0;
        int second =1;    

        System.out.print(first + " " + second + " ");

        for(int i=3;i<=n;i++){

            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }

        sc.close();

    }
    


}
