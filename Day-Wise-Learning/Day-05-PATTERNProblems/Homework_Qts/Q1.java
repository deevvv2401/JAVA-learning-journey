//              *  *  *  *  * 
//           *  *  *  *  * 
//        *  *  *  *  * 
//     *  *  *  *  * 
//  *  *  *  *  * 


public class Q1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            //Spaces ka block !
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            //Stars ka block !
            for(int k=1;k<=n;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
