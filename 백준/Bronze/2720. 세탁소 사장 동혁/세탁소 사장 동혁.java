import java.io.*;

public class Main {

    static int[] arr = {25, 10, 5, 1};  // 달러를 센트로 환산

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int tmp = Integer.parseInt(br.readLine());
            for(int j=0; j<4; j++) {
                bw.write(tmp/arr[j]+" ");
                tmp = tmp % arr[j];
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}