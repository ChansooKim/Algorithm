import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while(!"0 0 0".equals(input = br.readLine())) {
            String[] arr = input.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);

            int max = Math.max(Math.max(a, b), c);
            double a2 = Math.pow(a, 2);
            double b2 = Math.pow(b, 2);
            double c2 = Math.pow(c, 2);
            if(max == a && a2 == b2+c2) {
                bw.write("right\n");
            } else if(max == b && b2 == a2+c2) {
                bw.write("right\n");
            } else if(max == c && c2 == a2+b2) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}