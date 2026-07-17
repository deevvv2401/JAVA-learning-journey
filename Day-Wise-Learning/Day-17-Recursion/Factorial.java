// package JAVA-learning-journey.Day-Wise-Learning.Day-17-Recursion;
import java.util.*;
public class Factorial {
    public static void Fact(int n, int fact){
        if (n==0) {
            // fact = fact * n;
            System.out.print(fact);
            return;
        }
        fact = fact * n;
        Fact(n-1, fact);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Fact(n, 1);

        sc.close();
    }
}
