// package JAVA-learning-journey.Day-Wise-Learning.Day-17-Recursion;
import java.util.*;

public class Recursion1 {

    public static void PrintNumb(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        PrintNumb(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();

        PrintNumb(n);

        sc.close();
    }

}