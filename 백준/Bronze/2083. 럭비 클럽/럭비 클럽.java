import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        while(!"# 0 0".equals(input = br.readLine())) {
            String[] inputs = input.split(" ");
            String name = inputs[0];
            int age = Integer.parseInt(inputs[1]);
            int weight = Integer.parseInt(inputs[2]);
            if(age > 17 || weight >= 80) {
                sb.append(name).append(" ").append("Senior").append("\n");
            } else {
                sb.append(name).append(" ").append("Junior").append("\n");
            }
        }
        System.out.println(sb);
    }
}