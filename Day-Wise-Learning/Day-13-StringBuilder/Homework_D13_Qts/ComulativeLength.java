// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class ComulativeLength{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Strings you wanna enter: ");
        int size = sc.nextInt();

        StringBuilder arr[] = new StringBuilder[size];

        int totLength = 0;
        for(int i=0;i<size;i++){
            System.out.print("Enter STRING at index "+i+" :");
            arr[i] = new StringBuilder(sc.next());
            totLength += arr[i].length();
        }

        System.out.print("Comulative Length is: "+totLength);

        sc.close();
    }
}