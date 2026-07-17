// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;

public class Commulativelength1 {
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter String 1: ");
    //     String String_one = sc.next();
    //     System.out.print("Enter String 2: ");
    //     String String_two = sc.next();
    //     System.out.print("Enter String 3: ");
    //     String String_three = sc.next();

    //     System.out.println(String_one.length()+String_two.length()+String_three.length());
    // }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Number of string you wanna enter: ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        int totLength = 0;

        for(int i=0;i<size;i++){
            System.out.print("Enter the String at Index:"+i+" :");
            arr[i] = sc.next();
            totLength += arr[i].length();
        }

        System.out.print("Commulative length is: "+totLength);
        sc.close();

    }
}

