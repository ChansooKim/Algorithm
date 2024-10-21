import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score = sc.nextInt();
        int P = sc.nextInt();
        Integer[] arr = new Integer[N];
        if(N>0) {
            for(int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, (a,b)->b-a);
            if(arr[arr.length-1] >= score && arr.length == P) {
                System.out.println(-1);
            } else {
                int rank = 1;
                for(int i=0; i<arr.length; i++) {
                    if(arr[i] > score) {
                        rank = i+2;
                    }
                }
                System.out.println(rank);
            }
        } else {
            System.out.println(1);
        }
    }
}