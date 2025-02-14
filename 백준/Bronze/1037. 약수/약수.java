import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int res;
        if(N==1) {
            res = arr[0]*arr[0];
        } else {
            Arrays.sort(arr);
            res = arr[0]*arr[N-1];
        }
        System.out.println(res);
    }
}