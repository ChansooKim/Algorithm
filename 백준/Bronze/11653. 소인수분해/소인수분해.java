import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        if(n==1) return;
        while(n!=1) {
            if(n==2 || n==3) {
                sb.append(n).append("\n");
                break;
            }
            for(int i=2; i<=n; i++) {
                if(n%i==0) {
                    sb.append(i).append("\n");
                    n = n/i;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}