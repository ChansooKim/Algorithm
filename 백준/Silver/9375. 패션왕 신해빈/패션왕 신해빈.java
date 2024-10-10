import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int T = Integer.parseInt(br.readLine());
            Map<String, Integer> categoryMap = new HashMap<>();
            for(int j=0; j<T; j++) {
                String[] input = br.readLine().split(" ");
                categoryMap.put(input[1], categoryMap.getOrDefault(input[1], 0)+1);
            }
            sb.append(checkTestcase(categoryMap)).append("\n");
        }
        System.out.println(sb);
    }

    static int checkTestcase(Map<String, Integer> map) {
        int cnt = 1;
        for(int x : map.values()) {
            cnt *= x+1;
        }
        return cnt-1;
    }
}