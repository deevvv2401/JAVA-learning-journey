// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.


import java.util.*;

public class Q1_Calculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a and b: ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Enter 1 for ADD.");
        System.out.println("Enter 2 for SUB.");
        System.out.println("Enter 3 for MUL.");
        System.out.println("Enter 4 for DIV.");
        System.out.println("Enter 5 for MODULO.");

        int operation = sc.nextInt();

        switch(operation){

            case 1 : System.out.println(a + " + " + b + " = " + (a+b));
            break;
            case 2 : System.out.println(a + " - " + b + " = " + (a-b));
            break;
            case 3 : System.out.println(a + " * " + b + " = " + (a*b));
            break;
            case 4 : System.out.println(a + " / " + b + " = " + (a/b));
            break;
            case 5 : System.out.println(a + " % " + b + " = " + (a%b));
            break;
            default : System.out.println("INVALID operation ! ! ! ");       
        }

        sc.close();
        
    }
    
}
