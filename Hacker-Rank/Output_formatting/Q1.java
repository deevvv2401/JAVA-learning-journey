// Explanation

// Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d",s1,x);
                System.out.println();
            }
            System.out.println("================================");
            sc.close();

    }
}
