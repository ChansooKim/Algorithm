import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        for(int i=X; i<=Y; i++) {
            if((i - X) % 4 == 0 && (i - X) % 2 == 0 && (i - X) % 3 == 0 && (i - X) % 5 == 0) {
                sb.append("All positions change in year ").append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}