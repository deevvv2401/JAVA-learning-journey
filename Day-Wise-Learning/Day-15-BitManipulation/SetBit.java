// package JAVA-learning-journey.Day-Wise-Learning.Day-15-BitManipulation;

import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter POSITION: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int setBit = bitMask | n;

        System.out.print("After performing SET BIT: "+ setBit);

        sc.close();
    }
}
