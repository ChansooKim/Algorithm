import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = 0;
        int score = 512;
        while(score > 0) {
            int cnt = 0;
            if(A>=score) {
                cnt++;
                A-=score;
            }
            if(B>=score) {
                cnt++;
                B-=score;
            }
            if(cnt==1) {
                C+=score;
            }
            score/=2;
        }
        System.out.println(C);
    }
}