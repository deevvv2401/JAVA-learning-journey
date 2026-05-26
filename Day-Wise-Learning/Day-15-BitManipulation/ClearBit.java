// package JAVA-learning-journey.Day-Wise-Learning.Day-15-BitManipulation;
import java.util.*;

public class ClearBit {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter POSITION: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);
        int newNumber = notbitMask & n;

        System.out.print("After performing ClEAR BIT: "+ newNumber);

        sc.close();
    }
}
