// package JAVA-learning-journey.Day-Wise-Learning.Day-16-Sorting;

public class InsertionSort {

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,2};

        //Assume i=0 --> SORTED PART..
        for(int i=1;i<arr.length;i++){          // 'i' means INDEX ki baat horyi hai !

            int current = arr[i];
            int j = i-1;                        // SORTED PART ka First assumed element !

            while(j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //PLACEMENT ...
            arr[j+1] = current;
        }

        PrintArr(arr);
    }

}
