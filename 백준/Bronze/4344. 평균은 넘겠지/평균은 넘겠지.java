import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int C = sc.nextInt();
        for(int i=0; i<C; i++) {
            int N = sc.nextInt();
            int sum = 0;
            int[] arr = new int[N];
            for(int j=0; j<N; j++) {
                int tmp = sc.nextInt();
                arr[j] = tmp;
                sum += tmp;
            }
            int avg = sum/N;
            int cnt = 0;
            for(int x : arr) {
                if(avg < x) cnt++;
            }
            double rate = ((double) cnt /N)*100;
            sb.append(String.format("%.3f", rate)).append("%").append("\n");
        }
        System.out.println(sb);
    }
}