// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

import java.util.*;

public class UserNamefrmMail {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email: ");
        StringBuilder sb = new StringBuilder(sc.next());

        int a =0;
        for(int i=0;i<sb.length();i++){
            if (sb.charAt(i) == '@') {
                a += i;
            }
        }

        System.out.print("Your USERNAME is: "+sb.delete(a,sb.length()));
        sc.close();
    }
}
