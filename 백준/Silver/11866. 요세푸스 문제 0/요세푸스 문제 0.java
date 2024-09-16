import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            queue.offer(i);
        }
        while(!queue.isEmpty()) {
            for(int i=0; i<k-1; i++) {
                queue.offer(queue.poll());
            }
            list.add(queue.poll());
        }
        sb.append("<");
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
            if(i != list.size()-1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}