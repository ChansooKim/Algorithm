import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<t; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();
            for(int j=0; j<n; j++) {
                queue.offer(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;
            while(true) {
                if(queue.isEmpty()) break;
                int[] first = queue.pollFirst();
                boolean isMax = true;
                for(int j=0; j<queue.size(); j++) {
                    if(first[1] < queue.get(j)[1]) {
                        queue.offer(first);
                        for(int k=0; k<j; k++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if(!isMax) continue;
                cnt++;
                if(first[0] == m) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}