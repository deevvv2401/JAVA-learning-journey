import java.util.*;

public class ClearBit1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter Bit you wanna Clear: ");
        int bit = sc.nextInt();
        int pos = bit-1;

        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = (newBitMask & n);

        System.out.print("After clearing: "+newNumber);

        sc.close();

    }
}
