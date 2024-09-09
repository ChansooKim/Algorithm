import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j=0; j<s.length(); j++) {
                char tmp = s.charAt(j);
                for(int x=0; x<r; x++) bw.write(tmp);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}