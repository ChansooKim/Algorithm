import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        for(int i=1; i<=26; i++) {
            arr[i-1] = i;
        }
        int l = Integer.parseInt(br.readLine());
        long sum = 0;
        String s = br.readLine();
        for(int i=0; i<l; i++) {
            sum += (arr[s.charAt(i)-'a']*(long)Math.pow(31, i));
        }
        System.out.println(sum);
    }
}