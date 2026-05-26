//              *  *  *  *  * 
//           *  *  *  *  * 
//        *  *  *  *  * 
//     *  *  *  *  * 
//  *  *  *  *  * 

import java.util.*;

public class tiltedrectangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n; ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            //SPACES..
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }

            //STARS
            for(int k=1;k<=n;k++){
                System.out.print(" * ");
            }

            System.out.println();

        }
        sc.close();
    }
}


