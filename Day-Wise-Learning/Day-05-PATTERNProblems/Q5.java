//           * 
//        *  * 
//     *  *  * 
//  *  *  *  * 


public class Q5 {
    public static void main(String[] args) {
        int n=4;
                                            //Sequence of Space and Star Block MATTERS !
        for(int i=1;i<=n;i++){
            //Spaces ka block ! !
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            //Stars ka block ! !
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }    
}
