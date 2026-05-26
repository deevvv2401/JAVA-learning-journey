// package JAVA-learning-journey.Day-Wise-Learning.Day-15-BitManipulation;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        
        //oper =1 --> SET oper =0 --> CLEAR
        int n=5;
        int pos=2;
        //oper=1; //Update bit to 1 else update bit to 0 ..
        int bitMask = 1<<pos;

        if (oper == 1) {
            //set                               0101 -> 0111 (7)
            int newNumber =  bitMask | n;
            System.out.print(newNumber);
        }   else{
            //clear
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.print(newNumber);
        }

        sc.close();
    }
}
