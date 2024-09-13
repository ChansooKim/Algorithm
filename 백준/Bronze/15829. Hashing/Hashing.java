import java.io.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for(int i=1; i<=26; i++) {
            arr[i-1] = i;
        }
        int l = Integer.parseInt(br.readLine());
        BigDecimal sum = BigDecimal.ZERO;
        String s = br.readLine();
        for(int i=0; i<l; i++) {
            sum = sum.add(new BigDecimal("31").pow(i).multiply(new BigDecimal(arr[s.charAt(i)-'a'])));
        }
        System.out.println(sum.remainder(new BigDecimal("1234567891")));
    }
}