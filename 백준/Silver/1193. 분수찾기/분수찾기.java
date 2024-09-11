import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int crossCnt = 1;
        int prevCntSum = 0;
        while(true) {
            if(n <= prevCntSum + crossCnt) {
                if(crossCnt % 2 == 1) {
                    System.out.println((crossCnt -(n-prevCntSum-1))+"/"+(n-prevCntSum));
                    break;
                } else {
                    System.out.println((n-prevCntSum)+"/"+(crossCnt - (n-prevCntSum-1)));
                    break;
                }
            } else {
                prevCntSum += crossCnt;
                crossCnt++;
            }
        }
    }
}