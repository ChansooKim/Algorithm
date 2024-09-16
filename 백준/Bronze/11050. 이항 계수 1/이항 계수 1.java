import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        System.out.println(permutation(n, k)/permutation(k, k));
    }

    private static int permutation(int n, int k) {
        int m = 1;
        for(int i=0; i<k; i++) {
            m*=n;
            n--;
        }
        return m;
    }
}