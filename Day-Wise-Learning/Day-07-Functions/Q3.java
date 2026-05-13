// COmpute Factorial !

import java.util.*;

public class Q3 {
    
  public static void printFactorial(int a){

    if(a < 0) {System.out.print("INVALID Number !");
    return;
    }

    else if(a == 0 || a == 1) {
        System.out.print(1);
    }

    else{
        int b = 1;

        for(int i = 1; i <= a; i++){ 
            b = b * i;
        }
        System.out.print(b);
    }
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        printFactorial(n);

        sc.close();
    }
}
