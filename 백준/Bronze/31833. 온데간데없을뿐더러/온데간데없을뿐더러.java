import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = "", B = "";
        for(int i=0; i<N; i++) {
            String tmp = sc.next();
            A += tmp;
        }
        for(int i=0; i<N; i++) {
            String tmp = sc.next();
            B += tmp;
        }
        System.out.println(Math.min(Long.parseLong(A), Long.parseLong(B)));
    }
}