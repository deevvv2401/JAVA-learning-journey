import java.util.*;

public class SetBit1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter Bit you wanna SET : ");
        int bit = sc.nextInt();
        int pos = bit-1;

        int bitMask = 1<<pos;
        int newNumber = (bitMask | n);

        System.out.print("After Setting: "+newNumber);

        sc.close();
    }   
}
