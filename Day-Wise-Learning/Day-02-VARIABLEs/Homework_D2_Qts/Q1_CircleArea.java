package Homework_D2_Qts;
import java.util.*;

public class Q1_CircleArea {
    
    public static void main(String[] args) {
        
        System.out.println("Enter circle Radius:");
        Scanner r = new Scanner(System.in);             //INPUT
        int R = r.nextInt();                
        double A = (3.14) * R * R;

        System.out.println("The area of circle with radius " + R + " is " + A);

        r.close();
    }
}
