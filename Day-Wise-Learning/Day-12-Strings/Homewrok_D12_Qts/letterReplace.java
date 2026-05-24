// package JAVA-learning-journey.Day-Wise-Learning.Day-12-Strings.Homewrok_D12_Qts;

import java.util.*;

public class letterReplace {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your STRING: ");
        String string = sc.next();

         String newString = "";

        for(int i=0;i<string.length();i++){
            if (string.charAt(i) == 'e') {
                
                // string.charAt(i) = 'i';
                // System.out.println(string.charAt(i));

                newString += 'i';
            }   else{
                newString += string.charAt(i);
            }
        }


        newString = newString + 'z' + 'o';        // We can add any Character to a aString like this ! ! ! !


        System.out.println("Modified STRING is : "+newString);

        sc.close();
    }    
}
