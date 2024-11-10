import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input;
        while(!"*".equals(input = sc.nextLine())) {
            String[] inputs = input.split(" ");
            char t = inputs[0].toLowerCase().charAt(0);
            boolean isTautogram = true;
            for(int i=1; i<inputs.length; i++) {
                char tmp = inputs[i].toLowerCase().charAt(0);
                if(t != tmp) {
                    isTautogram = false;
                    break;
                }
            }
            if(isTautogram) sb.append("Y");
            else sb.append("N");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}