import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("/");
        int k = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int a = Integer.parseInt(arr[2]);
        checkReal(k, d, a);
    }

    private static void checkReal(int k, int d, int a) {
        if(k+a < d || d==0) System.out.println("hasu");
        else System.out.println("gosu");
    }
}