import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<3; i++) {
            int N = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;
            for(int j=0; j<N; j++) {
                sum = sum.add(sc.nextBigInteger());
            }
            if(sum.equals(BigInteger.ZERO)) {
                sb.append(0);
            } else {
                if(sum.compareTo(BigInteger.ZERO) > 0) sb.append("+");
                else sb.append("-");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}