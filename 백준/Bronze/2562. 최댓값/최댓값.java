import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num = 0;
        for(int i=1; i<=9; i++) {
            int a = sc.nextInt();
            max = Math.max(max, a);
            if(max == a) num = i;
        }
        System.out.println(max+"\n"+num);
    }
}