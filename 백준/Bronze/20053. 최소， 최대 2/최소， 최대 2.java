import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=0; j<N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                min = Math.min(tmp, min);
                max = Math.max(tmp, max);
            }
            sb.append(min).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}