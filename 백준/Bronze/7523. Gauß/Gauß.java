import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            String[] tmp = br.readLine().split(" ");
            long n = Long.parseLong(tmp[0]);
            long m = Long.parseLong(tmp[1]);
            BigInteger sum = ((BigInteger.valueOf(m).multiply(BigInteger.valueOf(m+1))).divide(BigInteger.TWO))
                    .subtract((BigInteger.valueOf(n-1).multiply(BigInteger.valueOf(n))).divide(BigInteger.TWO));
            bw.write("Scenario #"+(i+1)+":\n");
            bw.write(sum+"\n");
            if(i < t-1) bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}