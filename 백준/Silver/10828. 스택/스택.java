import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
            String[] arr = br.readLine().split(" ");
            String a = arr[0];
            if("push".equals(a)) {
                stack.push(Integer.valueOf(arr[1]));
            } else if("pop".equals(a)) {
                if(stack.isEmpty()) bw.write(-1+"\n");
                else bw.write(stack.pop()+"\n");
            } else if("size".equals(a)) {
                bw.write(stack.size()+"\n");
            } else if("empty".equals(a)) {
                bw.write((stack.isEmpty()?1:0)+"\n");
            } else if("top".equals(a)) {
                if(stack.isEmpty()) bw.write(-1+"\n");
                else bw.write(stack.peek()+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}