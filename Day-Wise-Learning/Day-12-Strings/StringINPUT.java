import java.util.*;

public class StringINPUT {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        String name = sc.next();            //Just a single Word . . 
        String naam = sc.nextLine();        //Takes the whole sentence as INPUT . . .

        System.out.println("Your name is: "+name);
        System.out.print("Your naam is: "+naam);

        sc.close();
    }
}
