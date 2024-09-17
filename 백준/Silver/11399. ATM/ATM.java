import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int time = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                time += arr[j];     // 1 + (1+2) + (1+2+3) + (1+2+3+3) + (1+2+3+3+4)
            }
        }
        System.out.println(time);
    }
}