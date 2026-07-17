// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String mail = sc.next();

        // int a=0;
        // for(int i=0;i<mail.length();i++){
        //     if (mail.charAt(i) == '@') {
        //         a = a+i;
        //     }
        // }
        // System.out.print("Your USERNAME is: ");
        // for(int j=0;j<a;j++){
        //     System.out.print(mail.charAt(j));
        // }

        String UserName = "";
        for(int i=0;i<mail.length();i++){
            if (mail.charAt(i) == '@') {
                break;
            }   else{
                UserName += mail.charAt(i);
            }
        }

        System.out.print("Your USERNAME is: "+UserName);
        sc.close();
    }
}
