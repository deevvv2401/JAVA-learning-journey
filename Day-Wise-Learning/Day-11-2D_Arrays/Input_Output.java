import java.util.*;

public class Input_Output {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int array[][]= new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter number for index: "+i+j+" :");
                array[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
