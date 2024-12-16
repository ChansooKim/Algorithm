import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String pre = sc.nextLine();
        String post = sc.nextLine();
        int len = pre.length();
        boolean res = true;
        if(N%2==0) {
            for(int i=0; i<len; i++) {
                if(pre.charAt(i) != post.charAt(i)) {
                    res = false;
                    break;
                }
            }
        } else {
            for(int i=0; i<len; i++) {
                if(pre.charAt(i) == post.charAt(i)) {
                    res = false;
                    break;
                }
            }
        }
        if(res) System.out.println("Deletion succeeded");
        else System.out.println("Deletion failed");
    }
}