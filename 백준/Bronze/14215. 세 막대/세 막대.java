import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c) {
            System.out.println(a*3);
        } else {
            int max = Math.max(Math.max(a, b), c);
            if(max == a && a>=b+c) a = b+c-1;
            else if(max == b && b>=a+c) b = a+c-1;
            else if(max ==c && c>=a+b) c = a+b-1;
            System.out.println(a+b+c);
        }
    }
}