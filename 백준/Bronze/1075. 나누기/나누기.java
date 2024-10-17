import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int F = Integer.parseInt(br.readLine());
        int start = Integer.parseInt(N.substring(0, N.length()-2)+"00");
        int end = Integer.parseInt(N.substring(0, N.length()-2)+"99");
        int tmp = 0;
        for(int i=start; i<=end; i++) {
            if(i%F==0) {
                tmp = i;
                break;
            }
        }
        String answer = String.valueOf(tmp).substring(N.length()-2);
        System.out.println(answer);
    }
}