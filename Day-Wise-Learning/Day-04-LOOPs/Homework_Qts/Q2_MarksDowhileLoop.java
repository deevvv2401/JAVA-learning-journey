import java.util.*;

public class Q2_MarksDowhileLoop {
    

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.print("Enter 1 to Continue and 0 to Stop:");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Marks:");
                int m = sc.nextInt();

                if (m >= 90 && m <= 100) {
                    System.out.println("This is Good");
                }

                else if (m >= 60 && m <= 89) {
                    System.out.println("This is also Good");
                }

                else if (m >= 0 && m <= 59) {
                    System.out.println("This is Good as well");
                }

                else {
                    System.out.println("Invalid Marks");
                }
            }

        } while (choice != 0);

        System.out.println("Program Stopped!");

        sc.close();
    }
    
}
