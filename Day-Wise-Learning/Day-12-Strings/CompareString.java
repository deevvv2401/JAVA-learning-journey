

public class CompareString {
    public static void main(String[] args) {
        //Compare - - ->
        String name1 = "Tony";
        String name2 = "Tony";


        //CASE1: s1>s2 ---> return +ve value (random)
        //CASE1: s1=s2 ---> 0
        //CASE1: s1<s2 ---> return -ve value (random)
     
        //   <- - -  - Comparing strings - - - ->        
        //hello v/s wello  --> h>w 
        //hello v/s cello  --> c>h
        //aahello v/s aabello  --> a=a , a=a , h>b
        

        // .comapareTo Command   !   !

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // }   else{
        //     System.out.println("String are not equal !");
        // }


        // if(name1 == name2){
        //     System.out.println("Strings are equal");
        // }   else{
        //     System.out.println("String are not equal !");
        // }


        if(new String("Tony") == new String("Tony")){                   // WHY WRONG ??
            System.out.println("String are equal");
        }   else{
            System.out.println("Strings are NOT equal");
        }
    }    
}
