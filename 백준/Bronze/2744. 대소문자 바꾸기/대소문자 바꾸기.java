import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(char x : input.toCharArray()) {
            if(Character.isLowerCase(x)) {
                sb.append(Character.toUpperCase(x));
            } else {
                sb.append(Character.toLowerCase(x));
            }
        }
        System.out.println(sb);
    }
}