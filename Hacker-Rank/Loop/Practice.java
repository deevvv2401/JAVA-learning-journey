import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int a=0;
        int power=1;
        for(int i=0;i<n;i++){

            a=a+power;
            System.out.print(a+" ");;
            power = power*2;
        }
        sc.close();
    }
}
