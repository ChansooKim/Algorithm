import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            String[] inputs = br.readLine().split(" ");
            String domain = inputs[0];
            String name = inputs[1];
            map.put(domain, name);
        }
        for(int i=0; i<M; i++) {
            String find = br.readLine();
            sb.append(map.get(find)).append("\n");
        }
        System.out.println(sb);
    }
}