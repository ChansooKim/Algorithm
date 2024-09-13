import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int start = s.length()-5;
        String answer = "";
        for(int i=start; i<n; i++) {
            answer+=s.charAt(i);
        }
        System.out.println(answer);
    }
}