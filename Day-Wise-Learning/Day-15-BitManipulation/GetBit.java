// package JAVA-learning-journey.Day-Wise-Learning.Day-15-BitManipulation;

import java.util.*;

public class GetBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int bitNum = pos+1;

        if((bitMask & n) == 0){
            System.out.print("Bit at "+pos+" , where Bit  Number is "+ bitNum + " is: 0");
        }   else{
            System.out.print("Bit at "+pos+" , where Bit  Number is "+ bitNum + " is: 1");
        }

        sc.close();
    }
}
