import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while(!(input = br.readLine()).equals("0 0")) {
            String[] arr = input.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            if(a>b && a%b==0) {
                bw.write("multiple\n");
            } else if(a<b && b%a==0) {
                bw.write("factor\n");
            } else {
                bw.write("neither\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}