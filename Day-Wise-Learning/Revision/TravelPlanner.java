import java.util.Scanner;

public class TravelPlanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      TRAVEL PLANNER SYSTEM");
        System.out.println(" Using Sets and Relations in Java");
        System.out.println("====================================");

        while (true) {

            System.out.println("\nSET A : BUDGET");
            System.out.println("1. Low");
            System.out.println("2. Medium");
            System.out.println("3. High");

            System.out.print("Choose Budget : ");
            int budget = sc.nextInt();

            System.out.println("\nSET B : SEASON");
            System.out.println("1. Summer");
            System.out.println("2. Winter");
            System.out.println("3. Monsoon");

            System.out.print("Choose Season : ");
            int season = sc.nextInt();

            System.out.println("\n------------------------------------");
            System.out.println("RESULT FROM RELATION R(A,B,C)");
            System.out.println("------------------------------------");

            String destination = "";

            // Relation Mapping

            if (budget == 1 && season == 1) {
                destination = "Jaipur";
            }
            else if (budget == 1 && season == 2) {
                destination = "Shimla";
            }
            else if (budget == 1 && season == 3) {
                destination = "Kerala";
            }
            else if (budget == 2 && season == 1) {
                destination = "Goa";
            }
            else if (budget == 2 && season == 2) {
                destination = "Manali";
            }
            else if (budget == 2 && season == 3) {
                destination = "Bali";
            }
            else if (budget == 3 && season == 1) {
                destination = "Andaman";
            }
            else if (budget == 3 && season == 2) {
                destination = "Switzerland";
            }
            else if (budget == 3 && season == 3) {
                destination = "Ladakh";
            }
            else {
                System.out.println("Invalid Choice!");
                continue;
            }

            System.out.println("Recommended Destination : "
                    + destination);

            System.out.println("\nRelation Used:");
            System.out.println("(Budget , Season) -> Destination");

            System.out.println("\nDo you want another recommendation?");
            System.out.println("1. Yes");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("\nThank You For Using Travel Planner!");
                break;
            }
        }

        sc.close();
    }
}