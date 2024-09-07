import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int stick = 64;
        int tmp = 0;
        int answer = 0;
        int result = x;
        while (true) {
            if (x == 64) {
                answer++;
                break;
            }
            stick /= 2;
            if (stick <= x) {
                tmp += stick;
                answer++;
                if (result == tmp) {
                    break;
                }
                x -= stick;
            }

        }
        System.out.println(answer);
    }
}