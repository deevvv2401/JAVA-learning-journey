//              1 
//           2  1  2 
//        3  2  1  2  3 
//     4  3  2  1  2  3  4 
//  5  4  3  2  1  2  3  4  5

import java.util.*;

public class SymtNumPymd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            //SPACES..
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            
            //NUMBERS 1st PART..
            int a=i;
            for(int j=1;j<=i;j++){
                System.out.print(" "+a+" ");
                a--;
            }

            //NUMBERS 2nd PART..
            int b=2;
            for(int l=1;l<=i-1;l++){
                System.out.print(" "+b+" ");
                b++;
            }

            System.out.println();

        }
        sc.close();
    }
}
