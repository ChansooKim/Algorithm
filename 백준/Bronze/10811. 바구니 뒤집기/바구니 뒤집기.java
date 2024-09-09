import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;
        for(int x=0; x<m; x++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            while(i<j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        for(int x : arr) System.out.print(x+" ");
    }
}