import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int num = 2;
        int cnt = 1;
        int[] dp = new int[1001];
        dp[0] = 1;
        for(int i=1; i<=1000; i++) {
            dp[i] = num;
            if(cnt==num) {
                num++;
                cnt = 1;
            } else {
                cnt++;
            }
        }
        int sum = 0;
        for(int i=A-1; i<B; i++) {
            sum += dp[i];
        }
        System.out.println(sum);
    }
}