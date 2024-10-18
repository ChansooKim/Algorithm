import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        int result = A.length();
        for(int i=0; i<B.length()-A.length()+1; i++) {
            int cnt = 0;
            for(int j=0; j<A.length(); j++) {
                if(A.charAt(j) != B.charAt(j+i)) {
                    cnt++;
                }
            }
            result = Math.min(result, cnt);
        }
        System.out.println(result);
    }
}