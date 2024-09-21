import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i< T; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[11];
            dp[1] = 1;  // 1은 1로만
            dp[2] = 2;  // 2는 1+1, 2 2가지
            dp[3] = 4;  // 3은 1+1+1, 1+2, 2+1, 3 4가지
            // dp[n] = dp[n-3] + dp[n-2] + dp[n-1]
            for(int j=4; j<=n; j++) {
                dp[j] = dp[j-3]+dp[j-2]+dp[j-1];
            }
            sb.append(dp[n]).append("\n");
        }
        System.out.println(sb);
    }
}