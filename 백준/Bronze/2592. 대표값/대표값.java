import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[1001];
        for(int i=1; i<=10; i++) {
            int n = sc.nextInt();
            arr[n] = arr[n]+1;
            sum += n;
        }
        int avg = sum/10;
        int mode = 0;
        int tmp = 0;
        for(int i=1; i<1001; i++) {
            if(arr[i] > tmp) {
                tmp = arr[i];
                mode = i;
            }
        }
        System.out.println(avg+"\n"+mode);
    }
}