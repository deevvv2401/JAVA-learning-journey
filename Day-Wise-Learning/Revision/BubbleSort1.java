import java.util.*;

public class BubbleSort1 {
    public static void PrintArr( int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //InPuting of ARRAY !
        System.out.print("Enter your ARRAY size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter your ARRAY: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        // int arr[] = {7,8,3,1,2};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    //SWAP..
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArr(arr);

        sc.close();
    }
}
