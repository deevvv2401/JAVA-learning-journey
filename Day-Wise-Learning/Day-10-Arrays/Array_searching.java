import java.util.*;

public class Array_searching {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the number at INDEX at: "+i+"  ");
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Enter the number you wanna search: ");
        int x = sc.nextInt();

        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){   
                System.out.print(x+" found at INDEX: "+i);
                a=a+1;

                break;
            }
        }

        if(a==0) System.out.print(x+ " Not found ! !");

        sc.close();
    }
    
}
