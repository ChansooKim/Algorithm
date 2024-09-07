import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String[] answer = new String[t];
        int[] arr = new int[41];
        arr[1] = 1;
        for(int i=2; i<=40; i++) {
            arr[i] = arr[i-2]+arr[i-1];
        }

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            if(n==0) {
                answer[i] = "1 0";
            } else {
                answer[i] = arr[n-1]+" "+arr[n];
            }
        }

        for(String x : answer) {
            System.out.println(x);
        }
    }
}