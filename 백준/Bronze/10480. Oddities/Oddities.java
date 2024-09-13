import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if(Math.abs(tmp)%2==1) bw.write(tmp+" is odd\n");
            else bw.write(tmp+" is even\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}