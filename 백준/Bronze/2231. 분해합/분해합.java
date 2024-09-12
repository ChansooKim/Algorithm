import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int x = Integer.parseInt(n);
        for(int i=0; i<x; i++) {
            String str = String.valueOf(i);
            int sum = 0;
            for(int j=0; j<str.length(); j++) {
                int tmp = Integer.parseInt(String.valueOf(str.charAt(j)));
                sum += tmp;
            }
            int val = x - sum;
            if(val == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}