import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for(int i=N-1; i>=0; i--) {
            if(K==0) break;
            int tmp = arr[i];
            if(tmp <= K) {
                cnt += K/tmp;
                K = K%tmp;
            }
        }
        System.out.println(cnt);
    }
}