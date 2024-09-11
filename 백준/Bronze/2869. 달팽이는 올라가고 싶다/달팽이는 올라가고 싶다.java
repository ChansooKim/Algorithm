import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        double a = Integer.parseInt(input[0]);
        double b = Integer.parseInt(input[1]);
        double v = Integer.parseInt(input[2]);
        int answer = (int) Math.ceil((v-b)/(a-b));
        System.out.println(answer);
        br.close();
        // a , a-b+a, a-b+a-b+a, ...
        // 1    2        3
        // v = 2a-b   3a-2b
        // answer*(a-b) + b = v
        // answer = v-b / a-b
    }
}