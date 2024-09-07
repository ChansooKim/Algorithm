import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mbti = sc.next();
        int n = sc.nextInt();
        int answer = 0;
        for(int i=0; i<n; i++) {
            String tmp = sc.next();
            if(mbti.equals(tmp)) answer++;
        }
        System.out.println(answer);
    }
}