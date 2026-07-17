// package JAVA-learning-journey.Day-Wise-Learning.Day-17-Recursion;
import java.util.*;
public class SumOfNatNum {
    public static void SumNumb(int i, int n, int sum){
        if (i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        SumNumb( i+1, n, sum);
        System.out.println(i);          //Tells What happens while coming LOWER in STAck !?!?!
    }
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entr n: ");
        int n = sc.nextInt();
        SumNumb(1, n, 0);

        sc.close();
    } 
}
