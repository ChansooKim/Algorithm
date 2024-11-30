import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input;
        while(!"0 0".equals(input = sc.nextLine())) {
            String[] inputs = input.split(" ");
            int M = Integer.parseInt(inputs[0]);
            int F = Integer.parseInt(inputs[1]);
            sb.append(M+F).append("\n");
        }
        System.out.println(sb);
    }
}