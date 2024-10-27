import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);
        int res = rev(rev(X)+rev(Y));
        System.out.println(res);
    }

    static int rev(int x) {
        String str = String.valueOf(x);
        String nStr = "";
        for(int i=str.length()-1; i>=0; i--) {
            nStr+=str.charAt(i);
        }
        return Integer.parseInt(nStr);
    }
}