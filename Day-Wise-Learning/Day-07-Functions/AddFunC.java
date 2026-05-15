import java.util.*;


public class AddFunC {

    // FunC. to add two numbers ! ! !

    public static void add(int a,int b){

        System.out.print(a+b);
    }    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        add(a, b);

        sc.close();
    }
}
