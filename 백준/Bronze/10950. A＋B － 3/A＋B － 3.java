import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<t; i++) arr[i] = sc.nextInt()+sc.nextInt();
        for(int x : arr) System.out.println(x);
    }
}