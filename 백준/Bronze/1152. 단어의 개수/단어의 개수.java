import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        if(str.length()==0) {
            System.out.println(0);
            return;
        }
        String[] arr = str.split(" ");
        System.out.println(arr.length);
    }
}