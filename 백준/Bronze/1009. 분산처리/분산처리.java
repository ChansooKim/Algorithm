import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int result = 1;
            for(int j=0; j<b; j++) {
                result = (result*a)%10;
            }
            if(result==0) sb.append("10").append("\n");
            else sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}