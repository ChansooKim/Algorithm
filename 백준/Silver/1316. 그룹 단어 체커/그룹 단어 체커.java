import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            boolean[] isExist = new boolean[26];
            boolean isWord = true;
            char[] arr = s.toCharArray();
            int a = 'a';
            char preCh = arr[0];
            isExist[arr[0]-a] = true;
            for(int j=1; j<arr.length; j++) {
                char ch = arr[j];
                if(isExist[ch-a] && preCh != ch) {
                    isWord = false;
                    break;
                } else {
                    isExist[ch-a] = true;
                    preCh = ch;
                }
            }
            if(isWord) cnt++;
        }
        System.out.println(cnt);
    }
}