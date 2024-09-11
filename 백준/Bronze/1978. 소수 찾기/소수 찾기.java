import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            if(a<4) {
                if(a!=1) cnt++;
                continue;
            }
            boolean flag = true;
            for(int j=2; j<a; j++) {
                if(a%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) cnt++;
        }
        System.out.println(cnt);
    }
}