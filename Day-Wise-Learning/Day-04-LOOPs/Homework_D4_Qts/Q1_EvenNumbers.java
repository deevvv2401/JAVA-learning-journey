package Homework_D4_Qts;
import java.util.*;

public class Q1_EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0)  System.out.print(i);
            else System.out.print(" "); 
        }   
        sc.close();
    }
}
