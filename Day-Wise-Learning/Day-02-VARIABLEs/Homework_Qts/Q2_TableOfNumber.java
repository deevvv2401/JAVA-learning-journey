// Make a program that prints the table of a number that is input by the user.

import java.util.*;

public class Q2_TableOfNumber {
    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        //INPUT
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();

        System.out.println(n + " * 1 = " + n*1);
        System.out.println(n + " * 2 = " + n*2);
        System.out.println(n + " * 3 = " + n*3);
        System.out.println(n + " * 4 = " + n*4);
        System.out.println(n + " * 5 = " + n*5);
        System.out.println(n + " * 6 = " + n*6);
        System.out.println(n + " * 7 = " + n*7);
        System.out.println(n + " * 8 = " + n*8);
        System.out.println(n + " * 9 = " + n*9);
        System.out.println(n + " * 10 = " + n*10);

        num.close();
    }
}
