import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        boolean[] isPrime = new boolean[N+1];
        for(int i=2; i<=N; i++) {
            isPrime[i] = true;
        }
        for(int i=2; i*i<=N; i++) {
            if(isPrime[i]) {
                for(int j=i*i; j<=N; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i=M; i<isPrime.length; i++) {
            if(isPrime[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}