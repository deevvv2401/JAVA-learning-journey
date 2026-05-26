//                                        *  *                    *  * 
//                                        *                          * 
//                                        *  *  *              *  *  * 
//                                        *  *  *  *        *  *  *  * 
//                                        *  *  *  *  *  *  *  *  *  * 
//                                        *  *  *  *  *  *  *  *  *  * 
//                                        *  *  *  *        *  *  *  * 
//                                        *  *  *              *  *  * 
//                                        *  *                    *  * 
//                                        *                          *

import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();


        //UPPER HALF ..

        for(int i=1;i<=n;i++){

            //STARS 1st part..
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }

            //SPACES..
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("   ");
            }

            //STARS 2nd part..
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //LOWER HALF ..

        for(int i=n;i>=1;i--){

            //STARS 1st part..
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }

            //SPACES..
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("   ");
            }

            //STARS 2nd part..
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
