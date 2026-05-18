// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
 
public class CircumOfCircle {
    
    public static double Circumference(float n){

        double Circm= 2 * 3.14 * n;
        return Circm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your RADIUS:");
        int n=sc.nextInt();

        // Circumference(a)
        System.out.print("Your circumference is: "+Circumference(n));

        sc.close();
    }
}
