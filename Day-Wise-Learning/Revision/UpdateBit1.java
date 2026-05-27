import java.util.*;

public class UpdateBit1 {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter Bit you wanna update: ");
        int bit = sc.nextInt();
        int pos = bit-1;

        int bitMask = 1<<pos;

        if ((bitMask & n) != 0) {       //Concept used from GET BIT thing . . . . 
            int newBitMask =  ~(bitMask);
            int newNumber = (newBitMask & n);
            System.out.print("After Update: "+newNumber);
            
        }   else{
            int newNumber = (bitMask | n);
            System.out.print("After Update: "+newNumber);
        }
        sc.close();

    }
}
