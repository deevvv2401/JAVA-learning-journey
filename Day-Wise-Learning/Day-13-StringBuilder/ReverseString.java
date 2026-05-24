// package JAVA-learning-journey.Day-Wise-Learning.Day-13-StringBuilder;

// import java.util.*;

public class ReverseString {

    // <---------------EASiER METHOD----------------->


    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter your STRING: ");
    //     String str = sc.nextLine();
    //     // StringBuilder string = new StringBuilder(str);

    //     System.out.print("Your INPUT string is: "+str);

    //     System.out.print("\nYour REVERSE string is: ");
        
    //     for(int i=str.length()-1;i>=0;i--){
    //         System.out.print(str.charAt(i));
    //     }
    //     sc.close();
    // }

    public static void main(String[] args) {
         
        StringBuilder sb = new StringBuilder("hellokitty");

        for(int i=0;i<sb.length()/2;i++){

            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.print("Your REVERSE String is: "+sb);
    
    }
}