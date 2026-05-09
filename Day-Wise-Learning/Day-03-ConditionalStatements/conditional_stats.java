import java.util.*;

public class conditional_stats {

    public static void main(String[] args) {

        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1)            System.out.println("ONE");
        // else if (button == 2)       System.out.println("TWO");
        // else if (button == 3)       System.out.println("THREE");
        // else                        System.out.println("INVALID input");    

        switch(button) {

            case 1 : System.out.println("ONE");
            break;
            case 2 : System.out.println("TWO");
            break;
            case 3 : System.out.println("THREE");
            break;
            default : System.out.println("INVALID input");
            }
        sc.close();
    }
}