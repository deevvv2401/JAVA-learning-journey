import java.util.Scanner;

public class ArrOfNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        // Creating String array
        String names[] = new String[size];

        // Input names
        for(int i = 0; i < names.length; i++) {

            System.out.print("Enter name at INDEX " + i + ": ");
            names[i] = sc.next();
        }

        // Printing names
        System.out.println("\nStored Names:");

        for(int i = 0; i < names.length; i++) {

            System.out.println("Name at INDEX " + i + " is: " + names[i]);
        }

        sc.close();
    }
}
