import java.util.*;

public class Taing_input {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the SIZE of the array; ");
            int size = sc.nextInt();
            int marks[]= new int[size];

            //INPUT ka loop . . .
            for(int i=0;i<size;i++){
                System.out.print("INPUT at index "+i+" ");
                marks[i]=sc.nextInt();
            }

            //OUTPUT ka loop . . .
            for(int i=0;i<size;i++){
                System.out.println("At index "+i+" ,the OUTPUT is "+marks[i]);
            }

            sc.close();
        }
} 
