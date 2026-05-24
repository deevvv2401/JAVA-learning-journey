// package Homework-D11-Qts;

import java.util.*;

public class spiraloder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        //INPUT ka block !
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("The SPIRAL ORDER MATRIX is  :");
        int rowStart = 0;
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;

        //To print spiral order matrix . . 

        while(rowStart <= rowEnd && colStart <= colEnd){

            //1

            for(int col=colStart;col<=colEnd;col++){
                System.out.print(arr[rowStart][col] + " ");
            }

            rowStart++;

            // System.out.println();

            //2

            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(arr[row][colEnd] + " ");
            }

            colEnd--;

            // System.out.println();

            //3

            for(int col=colEnd;col>=colStart;col--){
                System.out.print(arr[rowEnd][col] + " ");
            }

            rowEnd--;

            // System.out.println();

            //4

            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(arr[row][colStart] + " ");
            }

            colStart++;

            System.out.println();
            // System.out.println();
        }
        
        sc.close();
    }
}
