import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(Arrays.binarySearch(arr, tmp)>=0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}