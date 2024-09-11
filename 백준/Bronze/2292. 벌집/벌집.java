import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine())-1;  // 기본값 1 뺌
        int cnt = 1;
        int calc = 1;
        while(n >= calc) {
            calc = calc+(cnt++*6);
        }
        System.out.println(cnt);
        // 1, 1+6*1, 1+6*1+6*2, 1+6*1+6*2+6*3...
        // 1 -> 1~7 -> 8~20 -> 21~45 -> 46~76
    }
}