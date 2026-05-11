//    29    27    25    23    21 
//          19    17    15    13 
//                11    9     7 
//                      5     3 
//                            1 


public class Q8_3 {
    public static void main(String[] args) {
        int n = 5;
        int a = (n*n)+(n-1);

        for(int i=1;i<=n;i++){
            //Spaces ka Block ! !
            for(int j=1;j<=i-1;j++){
                System.out.print("      ");
            }
            //Number Input ka Block ! ! 
            for(int k=1;k<=n+1-i;k++){
                System.out.print("   "+a+" ");
                a=a-2;
            }
            System.out.println();
        }
    }    
}
