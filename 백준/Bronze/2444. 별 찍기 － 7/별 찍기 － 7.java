import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        int tmp = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) bw.write(" ");
            for(int x=0; x<=tmp; x++) bw.write("*");
            tmp+=2;
            bw.write("\n");
        }
        tmp-=2;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<=i; j++) bw.write(" ");
            for(int x=0; x<tmp-1; x++) bw.write("*");
            tmp-=2;
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}