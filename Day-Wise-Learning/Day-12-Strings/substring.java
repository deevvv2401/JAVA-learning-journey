
public class substring {
    public static void main(String[] args) {

        String sentence = "MY name is TONY";
        String sentence1 = "TONY STARK";

        //.substring(beginning index , ending index);
        //begining index --> Exclusive . . .
        //ending index   --> Inclusive . . .
        
        String name = sentence.substring(11);
        String name1 = sentence.substring(12);
        String name2 = sentence.substring(13);
        String name3 = sentence1.substring(0,4);


        System.out.println(sentence.length());
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }
}
