import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int pre = a2;
        String mode = a1>a2 ? "descending":"ascending";
        for(int i=2; i<8; i++) {
            int x = sc.nextInt();
            if("ascending".equals(mode) && pre < x) {
                mode = "ascending";
            } else if("descending".equals(mode) && pre > x) {
                mode = "descending";
            } else {
                mode = "mixed";
                break;
            }
            pre = x;
        }
        System.out.println(mode);
    }
}