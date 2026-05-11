import java.util.*;

public class Q2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                //Cell -> (i,j)
                if(i==1||j==1||i==r||j==c){
                    System.out.print(" * ");
                }   else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
