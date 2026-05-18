// function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

public class VoterAge {

    public static void Age(int n){
        if(n<=18)   System.out.print("Person is NOT eligible to vote !");
        else    System.out.print("Person is eligible to vote !");
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n = sc.nextInt();

        Age(n);

        sc.close();
    }
    
}
