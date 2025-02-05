import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int distance = y-x;
            int max = (int) Math.sqrt(distance);
            if(max == Math.sqrt(distance)) {
                sb.append(2*max-1);
            } else if(distance <= Math.pow(max, 2)+max) {
                sb.append(2*max);
            } else {
                sb.append(2*max+1);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}