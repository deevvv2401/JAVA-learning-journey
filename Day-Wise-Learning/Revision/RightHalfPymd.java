//              * 
//           *  * 
//        *  *  * 
//     *  *  *  * 
//  *  *  *  *  *

import java.util.*;

public class RightHalfPymd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            //Spaces..
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }

            //Stars..
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }

            System.out.println();
        }
        sc.close();
    }
}
