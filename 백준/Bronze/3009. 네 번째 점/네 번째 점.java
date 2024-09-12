import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        String[] input3 = br.readLine().split(" ");
        int x1 = Integer.parseInt(input1[0]);
        int y1 = Integer.parseInt(input1[1]);
        int x2 = Integer.parseInt(input2[0]);
        int y2 = Integer.parseInt(input2[1]);
        int x3 = Integer.parseInt(input3[0]);
        int y3 = Integer.parseInt(input3[1]);
        int x = getPosition(x1, x2, x3);
        int y = getPosition(y1, y2, y3);
        System.out.println(x+" "+y);
    }

    static int getPosition(int a, int b, int c) {
        if(a == b && a != c) {
            return c;
        } else if(a == c && a != b) {
            return b;
        } else if(b == c && b != a) {
            return a;
        } else {
            return 0;
        }
    }
}