import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String res = "";
        int sCnt = 0, tCnt = 0;
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == 's') {
                sCnt++;
            } else if (str.charAt(i) == 't') {
                tCnt++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (sCnt == tCnt) {
                res = str.substring(i);
                break;
            } else if (str.charAt(i) == 's') {
                sCnt--;
            } else if (str.charAt(i) == 't') {
                tCnt--;
            }
        }
        System.out.println(res);
    }
}