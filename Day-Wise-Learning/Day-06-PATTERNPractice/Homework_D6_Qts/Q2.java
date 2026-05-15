package Homework_D6_Qts;
//                            *  *  *  *  * 
//                         *           *    
//                      *           *       
//                   *           *          
//                *  *  *  *  *             



// public class Q2 {
//     public static void main(String[] args) {
//         int n=5;
        
//         for(int i=1;i<=n;i++){

//              STARTING SPACES ka BLOCk ! ! ! !!   

//             for(int j=1;j<=n-i;j++){
//                 System.out.print("   ");
//             }

//              ACTUAL Rhombus (starts + spaces) ! ! ! !

//             for(int j=1;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){         
//                     System.out.print(" * ");
//                 }   else{
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


public class Q2{
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=2*n-1;j++){

                if(i+j==n+1||i+j==2*n|| i == 1 && j >= n && j <= 2*n-1|| i==n && j<=n ){                //upper line condition ->  i == 1 && j >= n && j <= 2*n-1
                    System.out.print(" * ");                                                            //lower line condition ->  i==n && j<=n 
                }   else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}