import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean[] visit = new boolean[N];
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(arr[i]<arr[j] && !visit[j]) {
                    visit[j] = true;
                    arr[i] = 0;
                    break;
                }
            }
        }
        int cnt = 0;
        for(int n=0; n<N; ++n) {
            if(arr[n] != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}