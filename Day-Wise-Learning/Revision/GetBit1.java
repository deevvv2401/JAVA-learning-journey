import java.util.*;

public class GetBit1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Which Bit you wanna check? :  ");
        int bit = sc.nextInt();
        int pos = bit-1;

        int bitMask = 1<<pos;
        int newNumber = (bitMask & n);
        
        if (newNumber==0) {
            System.out.print("Bit is: 0");
        }   else{
            System.out.print("Bit is: 1");
        }

        sc.close();
    }
}