import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibo = new int[21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if(fibo[n] > 0 || n==0) return fibo[n];
        if(n==1 || n==2) return fibo[n]=1;
        else return fibo[n]=fibonacci(n-1)+fibonacci(n-2);
    }
}