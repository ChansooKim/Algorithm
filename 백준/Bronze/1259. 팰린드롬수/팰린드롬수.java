import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while(!(input = br.readLine()).equals("0")) {
            int len = input.length();
            boolean isPalindrom = true;
            for(int i=0; i<len/2; i++) {
                if(input.charAt(i) != input.charAt(len-1-i)) {
                    isPalindrom = false;
                    break;
                }
            }
            if(isPalindrom) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}