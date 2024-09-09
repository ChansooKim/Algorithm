import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        int a = 'a'+0;  // 'a'의 아스키코드 값
        for(int i=0; i<26; i++) arr[i] = -1;
        for(int i=0; i<s.length(); i++) {
            int tmp = arr[s.charAt(i)-a];
            if(tmp == -1) arr[s.charAt(i)-a] = i;
        }
        for(int x : arr) System.out.print(x+" ");
    }
}