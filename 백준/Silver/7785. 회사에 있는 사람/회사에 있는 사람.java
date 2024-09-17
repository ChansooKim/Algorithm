import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String status = input[1];
            if(map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, status);
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());
        for(String x : list) System.out.println(x);
    }
}