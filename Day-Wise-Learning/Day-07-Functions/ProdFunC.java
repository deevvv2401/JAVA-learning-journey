//Print the product of two numbers !


import java.util.*;

public class ProdFunC {
    
    public static int CalculateProduct(int a, int b){

    return a*b;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a:  ");
        int a = sc.nextInt();
        System.out.print("Enter b:  ");
        int b = sc.nextInt();
        
        
        System.out.print("The Multiplication of " + a + " and " + b + " is " + CalculateProduct(a, b));
        
        sc.close();
    }
}
