import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while(!"0 0".equals(input=br.readLine())) {
            String[] inputs = input.split(" ");
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            int C = A-(B-A);
            sb.append(C).append("\n");
        }
        System.out.println(sb);
    }
}