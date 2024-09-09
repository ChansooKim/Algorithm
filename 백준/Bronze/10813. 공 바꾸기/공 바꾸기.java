import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }
        for(int x=0; x<m; x++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int tmp = arr[i];
            int tmp2 = arr[j];
            arr[i] = tmp2;
            arr[j] = tmp;
        }
        for(int x : arr) System.out.print(x+" ");
    }
}