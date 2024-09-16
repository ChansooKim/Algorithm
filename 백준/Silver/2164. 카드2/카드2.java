import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++) {
            queue.add(i);
        }
        int i = 1;
        int last = 0;
        while(!queue.isEmpty()) {
            if(i%2==0) {
                int tmp = queue.poll();
                last = tmp;
                queue.add(tmp);
            } else {
                last = queue.poll();
            }
            i++;
        }
        System.out.println(last);
    }
}