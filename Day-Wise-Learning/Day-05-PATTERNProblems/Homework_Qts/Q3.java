//              1 
//           2  1  2 
//        3  2  1  2  3 
//     4  3  2  1  2  3  4 
//  5  4  3  2  1  2  3  4  5 


public class Q3 {
    public static void main(String[] args) {
        int n=5;
        int a=1;

        for(int i=1;i<=n;i++){
            //Spaces ka loop !
            for(int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            //Numbers ka loop for 1st Triangle !
            a=i;
            for(int k=1;k<=i;k++){
                System.out.print(" "+a+" ");
                a--;
            }

            //Loop for 2nd triangle !
            int b=2;
            for(int l=1;l<=i-1;l++){
                System.out.print(" "+b+" ");
                b++;
            }
            System.out.println();
        }
    }    
}

