import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] conds = br.readLine().split(" ");
        int n = Integer.parseInt(conds[0]);
        int m = Integer.parseInt(conds[1]);
        int[] arr = new int[n];
        StringTokenizer st;
        for(int x=0; x<m; x++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int y=i; y<=j; y++) {
                arr[y-1] = k;
            }
        }
        br.close();
        for(int x : arr) System.out.print(x+" ");
    }
}