import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1, b = 1;
        int i = 1;
        while(true) {
            b+=4*i;
            a+=b;
            if(a>N) break;
            i++;
        }
        System.out.println(i);
    }
}