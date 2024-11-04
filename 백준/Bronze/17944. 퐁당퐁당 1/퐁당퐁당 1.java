import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();
        long cycle = 4*N-2;
        long pos = T%cycle;
        if(pos == 0) {
            pos = cycle;
        }
        int res;
        if(pos <= 2*N) {
            res = (int) pos;
        } else {
            res = (int) (4*N-pos);
        }
        System.out.println(res);
    }
}