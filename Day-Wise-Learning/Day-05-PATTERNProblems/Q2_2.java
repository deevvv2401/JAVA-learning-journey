

public class Q2_2 {
    public static void main(String[] args) {
        int r=5;
        int c=8;

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                //Cell -> (i,j)
                if(i==1||j==1||i==5||j==8){
                    System.out.print(" * ");
                }   else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}
