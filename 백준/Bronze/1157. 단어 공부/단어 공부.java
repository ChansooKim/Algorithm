import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] baseArr = new char[26];
        String s = br.readLine().toUpperCase();
        char[] arr = s.toCharArray();
        int max = Integer.MIN_VALUE;
        char chMax = '?';
        for(int i=0; i<arr.length; i++) {
            int tmp = arr[i]-'A';
            baseArr[tmp]+=1;
        }
        for(int i=0; i<baseArr.length; i++) {
            if(baseArr[i] > max) {
                max = baseArr[i];
                chMax = (char) (i+'A');
            } else if(baseArr[i] == max) {
                chMax = '?';
            }
        }
        System.out.println(chMax);
    }
}