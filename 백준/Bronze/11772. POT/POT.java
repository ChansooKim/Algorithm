import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        for(int i=0; i<N; i++) {
            String tmp = sc.next();
            String a = tmp.substring(0, tmp.length()-1);
            String b = tmp.substring(tmp.length()-1);
            double res = Math.pow(Integer.parseInt(a), Integer.parseInt(b));
            sum += res;
        }
        System.out.printf("%.0f", sum);
    }
}