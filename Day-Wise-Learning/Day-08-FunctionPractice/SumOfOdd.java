//function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class SumOfOdd {
    public static void Sum(int n){
        int a=0;
        for(int i=1;i<=n;i=i+2){
            a=a+i;
        }
        System.out.print("The SUM is: "+a);
        // return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n=sc.nextInt();

        Sum(n);

        sc.close();
    }
}
