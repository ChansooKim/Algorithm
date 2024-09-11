import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 0;
        for(int i=m; i<=n; i++) {
            boolean flag = true;
            if(i==1) continue;
            for(int j=2; j<i; j++) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sum += i;
                if(min == 0) min = i;
            }
        }
        if(min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}