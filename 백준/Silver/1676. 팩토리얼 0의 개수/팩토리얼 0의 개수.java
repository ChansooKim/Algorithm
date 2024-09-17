import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String factorial = String.valueOf(factorial(n));
        int cnt = 0;
        for(int i=factorial.length()-1; i>0; i--) {
            if(factorial.charAt(i) == '0') {
                cnt++;
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }

    static BigInteger factorial(int n) {
        if(n==0) return BigInteger.ONE;
        else if(n==1) return BigInteger.ONE;
        else return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
}