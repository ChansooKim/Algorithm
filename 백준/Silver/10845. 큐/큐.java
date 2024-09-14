import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for(int i=0; i<n; i++) {
            String[] arr = br.readLine().split(" ");
            String a = arr[0];
            if("push".equals(a)) {
                queue.add(Integer.valueOf(arr[1]));
                last = Integer.valueOf(arr[1]);
            } else if("pop".equals(a)) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(queue.poll()+"\n");
            } else if("size".equals(a)) {
                bw.write(queue.size()+"\n");
            } else if("empty".equals(a)) {
                bw.write((queue.isEmpty()?1:0)+"\n");
            } else if("front".equals(a)) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(queue.peek()+"\n");
            } else if("back".equals(a)) {
                if(queue.isEmpty()) bw.write(-1+"\n");
                else bw.write(last+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}