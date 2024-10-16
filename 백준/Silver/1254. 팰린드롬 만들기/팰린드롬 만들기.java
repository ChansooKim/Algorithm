import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chArr = str.toCharArray();
        int len = chArr.length;
        boolean isPalindrom = false;
        int min = 0;
        for(int i=0; i<len; i++) {
            if(chkPalindrom(str.substring(i))) {
                isPalindrom = true;
                min = i+len;
                break;
            }
        }
        if(!isPalindrom) {
            min = len*2;
        }
        System.out.println(min);
    }

    static boolean chkPalindrom(String str) {
        int len = str.length();
        int half = len/2;
        for(int i=0; i<=half; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
}