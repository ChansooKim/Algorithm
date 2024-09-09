import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int min = arr[0], max = arr[0];
        for(int x : arr) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        System.out.println(min+" "+max);
    }
}