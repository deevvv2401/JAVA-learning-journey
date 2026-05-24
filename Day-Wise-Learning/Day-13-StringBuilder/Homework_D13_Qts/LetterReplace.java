// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.*;

public class LetterReplace {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        StringBuilder sb = new StringBuilder(sc.next());

        for(int i=0;i<sb.length();i++){
            if (sb.charAt(i) == 'e') {
                sb.setCharAt(i, 'i');
            }
        }

        System.out.print("Your OUTPUT string is: "+sb);
        sc.close();
    }
}
