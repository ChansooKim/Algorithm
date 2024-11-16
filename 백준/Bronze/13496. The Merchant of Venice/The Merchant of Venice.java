import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int k = sc.nextInt();
        for(int i=0; i<k; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int total = 0;
            for(int j=0; j<a.length; j++) {
                a[j] = sc.nextInt();
                b[j] = sc.nextInt();
                if(s*d >= a[j]) {
                    total += b[j];
                }
            }
            sb.append("Data Set " + (i+1) + ":").append("\n").append(total).append("\n\n");
        }
        System.out.println(sb);
    }
}