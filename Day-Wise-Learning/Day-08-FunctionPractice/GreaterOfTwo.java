public class GreaterOfTwo {

    // Function to return greater number
    static int greater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = greater(num1, num2);

        System.out.println("Greater number is: " + result);
    }
}