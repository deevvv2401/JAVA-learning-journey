// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;

public class EnterNumbers {
    public static void main(){

        Scanner sc=new Scanner(System.in);
        int positive=0,negative=0,zero=0;
        int num;
        char choice='y';

        while(choice=='y' || choice=='Y'){
            
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num>0)   positive++;
            else if(num<0)   negative++;
            else   zero++;

            System.out.print("Do you want to continue:(y/n)");
            choice = sc.next().charAt(0);
        }

        System.out.println("\nPositive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("ZERO numbers: "+zero);

        sc.close();
    }
    
    
}
