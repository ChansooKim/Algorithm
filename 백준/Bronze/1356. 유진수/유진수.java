import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] arr = N.toCharArray();
        String isYujinsu = "NO";
        for(int i=1; i<arr.length; i++) {
            int tmp = 1;
            int tmp2 = 1;
            for(int j=0; j<i; j++) {
                tmp *= Integer.parseInt(arr[j]+"");
            }
            for(int j=i; j<arr.length; j++) {
                tmp2 *= Integer.parseInt(arr[j]+"");
            }
            if(tmp == tmp2) {
                isYujinsu = "YES";
                break;
            }
        }
        System.out.println(isYujinsu);
    }
}