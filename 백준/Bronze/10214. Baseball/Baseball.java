import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int scoreY = 0;
            int scoreK = 0;
            for(int j=0; j<9; j++) {
                scoreY+=sc.nextInt();
                scoreK+=sc.nextInt();
            }
            if(scoreY>scoreK) sb.append("Yonsei");
            else if(scoreY<scoreK) sb.append("Korea");
            else sb.append("Draw");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}