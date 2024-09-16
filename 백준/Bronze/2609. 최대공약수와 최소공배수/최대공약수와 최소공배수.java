import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int answer1 = 1;
        for(int i=2; i<a*b; i++) {
            if(a%i==0 && b%i==0) {
                answer1 = i;
            }
        }
        int answer2 = answer1*(a/answer1)*(b/answer1);
        System.out.println(answer1+"\n"+answer2);
        br.close();
    }
}