import java.util.Scanner;

public class Main {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sb.append(dp(M, N)).append("\n");
        }
        System.out.println(sb);
    }

    static int dp(int n, int r) {
        if(dp[n][r] > 0) {
            return dp[n][r];
        }
        if(n==r || r==0) {
            return dp[n][r] = 1;
        }
        return dp[n][r] = dp(n-1, r-1) + dp(n-1, r);
    }
}