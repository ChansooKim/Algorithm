import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input=br.readLine())!=null) {
            int n = Integer.parseInt(input);
            sb = new StringBuilder();
            int x = (int) Math.pow(3, n);
            sb.append("-".repeat(x));
            cantor(0, x);
            System.out.println(sb);
        }
    }

    static void cantor(int start, int size) {
        if(size == 1) {
            return;
        }

        int newSize = size/3;
        for(int i=start+newSize; i<start+2*newSize; i++) {
            sb.setCharAt(i, ' ');
        }
        cantor(start, newSize);
        cantor(start+2*newSize, newSize);
    }
}