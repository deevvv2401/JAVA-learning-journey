import java.util.*;

public class SelectionSort1 {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array: ");
        int size = sc.nextInt();
        System.out.print("Enter your ARRAY: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //SORTING BEGINSsss....
        for(int i=0;i<arr.length-1;i++){

            int smallest = i;

            for(int j=i+1;j<arr.length;j++){
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]  = temp;
        }
        PrintArr(arr);
        sc.close();
    }
}
