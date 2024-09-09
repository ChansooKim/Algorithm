import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++) {
            int tmp = sc.nextInt();
            bw.write((arr[i]-tmp)+" ");
        }
        bw.flush();
        bw.close();
    }
}