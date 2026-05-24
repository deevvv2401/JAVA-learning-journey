// package Homework-D11-Qts;

import java.util.*;

public class transpose {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int arr[][] = new int [r][c];

        //INPUT .
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Your INPUT matrix is: \n");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //TRANSPOSE  . . . 

        System.out.print("Your TRANSPOSE Matrix is : \n");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
