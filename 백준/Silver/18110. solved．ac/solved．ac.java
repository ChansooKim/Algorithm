import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        int val = Math.round((float) (n * 15) /100);
        for(int i = val; i<n-val; i++) {
            sum+=arr[i];
        }
        System.out.println(Math.round((float) sum /(n-val*2)));
        br.close();
    }
}