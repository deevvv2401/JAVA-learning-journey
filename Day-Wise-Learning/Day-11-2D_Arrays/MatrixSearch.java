import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.print("Enter Number you wanna search: ");
        int x = sc.nextInt();

        int a=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(matrix[i][j] == x){
                    System.out.print("Number found at INDEX: "+i+" , "+j);
                    a = a+1;
                    break;
                }
            }
        }
        if(a==0)    System.out.print("Number NOT found !");

        sc.close();
    }
}

