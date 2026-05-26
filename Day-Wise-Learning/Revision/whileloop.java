//Ask user for p/w repeadetedly until enters correct p/d . . 

import java.util.*;

public class whileloop {
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     String pwd = ""        ;

    //     while (!pwd.equals("java123")) {
            
    //         System.out.print("Enter PASSWORD: ");
    //         pwd = sc.next();
    //         if (!pwd.equals("java123")) {
    //             System.out.println("Incorrect ! Try again . ");
    //         }            
    //     }
    //     System.out.print("Access Granted !");
    //     sc.close();
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String pwd = "";                                            // Keep Scope of pwd in mind !!
        do{
            System.out.print("Enter PASSWORD: ");
            pwd = sc.next();

            if(pwd.compareTo("java123")!=0){
                System.out.println("Incorrect ! Try Again .");
            }
        }   while(pwd.compareTo("java123")!=0);

        System.out.print("Access Granted ! ");
        sc.close();
    }
}
