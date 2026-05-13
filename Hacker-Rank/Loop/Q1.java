// Print 10 lines of output; each line i (where 0<=i<=10 ) contains the result of N*i in the form: N x i = result.


import java.io.*;




public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i=1;i<=10;i++){
            
            System.out.println(N+" x "+i+" = "+N*i);
        }

        bufferedReader.close();
    }
}
