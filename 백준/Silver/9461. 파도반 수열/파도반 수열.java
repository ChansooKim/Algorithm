import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long[] arr = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for(int i=4; i<=100; i++) {
            arr[i] = arr[i-3] + arr[i-2];
        }
        // P(N) = P(N-3)+P(N-2)
        for(int i=0; i<N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            sb.append(arr[tmp]).append("\n");
        }
        System.out.println(sb);
    }
}