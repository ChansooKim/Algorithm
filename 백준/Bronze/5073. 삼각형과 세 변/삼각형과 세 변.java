import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while(!(input = br.readLine()).equals("0 0 0")) {
            String[] tmp = input.split(" ");
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);
            int c = Integer.parseInt(tmp[2]);
            int max = Math.max(Math.max(a, b), c);
            if((max==a && a<b+c) || (max==b && b<a+c) || (max==c && c<a+b)) {
                if(a==b && a==c) bw.write("Equilateral\n");
                else if(a == b || a == c || b == c) bw.write("Isosceles\n");
                else bw.write("Scalene\n");
            } else {
                bw.write("Invalid\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}