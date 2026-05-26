//                                         * 
//                                      *  *  * 
//                                   *  *  *  *  * 
//                                *  *  *  *  *  *  * 
//                                *  *  *  *  *  *  * 
//                                   *  *  *  *  * 
//                                      *  *  * 
//                                         * 

import java.util.*;

public class FlipFlop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();


                                    //UPPER PART ..

        for(int i=1;i<=n;i++){

            //SPACES..
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }

            //STARS 1st part..
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }

            //STARS 2nd part..
            for(int l=1;l<=i-1;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }

                                    //LOWER PART ..

        for(int i=n;i>=1;i--){

            //SPACES..
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }

            //STARS 1st part..
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }

            //STARS 2nd part..
            for(int l=1;l<=i-1;l++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
