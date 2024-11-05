import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            int tmp = sc.nextInt();
            sb.append("=".repeat(Math.max(0, tmp)));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}