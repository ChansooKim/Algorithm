import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = reverse(sc.next());
        int b = reverse(sc.next());
        System.out.println(Math.max(a, b));
    }

    static int reverse(String num) {
        String reverseTxt = "";
        char[] arr = num.toCharArray();
        for(int i=2; i>=0; i--) reverseTxt += arr[i];
        return Integer.parseInt(reverseTxt);
    }
}