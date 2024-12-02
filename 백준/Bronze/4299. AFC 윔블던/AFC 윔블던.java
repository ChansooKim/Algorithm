import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = (A+B)/2;
        int y = A-x;
        if(x>=0&&y>=0 && (A+B)%2==0){
            System.out.println(x+" "+y);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}