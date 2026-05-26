//  29  27  25  23  21 
//      19  17  15  13 
//          11   9   7 
//               5   3 
//                   1 

import java.util.*;

public class Cont_RightPymd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = (n*n)+(n-1);

        for(int i=1;i<=n;i++){

            //SPACES ..
            for(int j=1;j<=i-1;j++){
                System.out.print("   ");
            }

            //NUMBERS ..
            for(int k=1;k<=n+1-i;k++){
                System.out.print(" "+a+" ");
                a = a - 2;
            }

            System.out.println();
            
        }
        sc.close();
    }
}
