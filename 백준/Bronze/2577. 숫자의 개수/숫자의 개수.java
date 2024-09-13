import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = a*b*c;
        int[] arr = new int[10];
        String tmp = String.valueOf(res);
        for(int i=0; i<tmp.length(); i++) {
            char ch = tmp.charAt(i);
            arr[Integer.parseInt(ch+"")]++;
        }
        for(int x : arr) {
            System.out.println(x);
        }
    }
}