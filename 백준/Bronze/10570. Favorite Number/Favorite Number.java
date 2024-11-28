import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            int V = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=0; j<V; j++) {
                int S = sc.nextInt();
                map.put(S, map.getOrDefault(S, 0)+1);
            }
            int max = 0;
            int res = 0;
            for (int x : map.keySet()) {
                int tmp = map.get(x);
                if (max < tmp) {
                    max = tmp;
                    res = x;
                } else if (max == tmp && res > x) {
                    res = x;
                }
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}