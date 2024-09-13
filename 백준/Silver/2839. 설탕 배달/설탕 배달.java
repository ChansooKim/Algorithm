import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minCnt = Integer.MAX_VALUE;
        for(int i=0; i<=n/3; i++) {
            for(int j=0; j<=n/5; j++) {
                if(i*3 + j*5 == n) {
                    minCnt = Math.min(minCnt, i+j);
                }
            }
        }
        if(minCnt == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(minCnt);
    }
}