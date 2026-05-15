//                 *                    * 
//                 *  *              *  * 
//                 *  *  *        *  *  * 
//                 *  *  *  *  *  *  *  * 
//                 *  *  *  *  *  *  *  * 
//                 *  *  *        *  *  * 
//                 *  *              *  * 
//                 *                    * 


public class Butterfly {
    public static void main(String[] args) {
        int n=4;

        //Upper half --------------->
        for(int i=1;i<=n;i++){
            // Stars 1st part !
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            // Spaces ka Loop !
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            // Stars 2nd part !
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();

            // <------------------LOWER PART---------------->
                          // 180 Degree R O T A T E 
        }    
            for(int o=n;o>=1;o--){
                // Stars 1st part !
                for(int j=1;j<=o;j++){
                    System.out.print(" * ");
                }
                // Spaces ka Loop !
                int spaces= 2*(n-o);
                for(int s=1;s<=spaces;s++){
                    System.out.print("   ");
                }
                // Stars 2nd part !
                for(int k=1;k<=o;k++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        
    }
}
