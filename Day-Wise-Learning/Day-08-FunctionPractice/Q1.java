// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Q1 {
    
    public static int Average(int a, int b, int c){

        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.println("The AVERAGE of "+a+", "+b+", "+c+" is : "+ Average(a, b, c));
        
        sc.close();
    }
}
