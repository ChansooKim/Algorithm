import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        for(int i=0; i<10; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a%42] = true;
        }
        int answer = 0;
        for(boolean x : arr) if(x) answer++;
        System.out.println(answer);
    }
}