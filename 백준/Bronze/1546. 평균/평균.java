import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        double max = Double.MIN_VALUE;
        for(int i=0; i<n; i++) max = Math.max(max, arr[i]);
        for(int i=0; i<n; i++) arr[i] = arr[i]/max*100;
        double sum = 0;
        for(double x : arr) sum += x;
        System.out.println(sum/n);
    }
}