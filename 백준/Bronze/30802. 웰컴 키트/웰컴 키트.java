import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        for(int i=0; i<6; i++) arr[i] = sc.nextInt();
        int t = sc.nextInt();
        int p = sc.nextInt();
        int tCnt = 0;
        for(int i=0; i<6; i++) {
            if(arr[i] == 0) {
            } else if(arr[i] >= t) {
                if(arr[i]%t == 0) tCnt += arr[i]/t;
                else tCnt += arr[i]/t + 1;
            } else {
                tCnt++;
            }
        }
        int pCnt1 = n/p;
        int pCnt2 = n%p;
        System.out.println(tCnt);
        System.out.println(pCnt1+" "+pCnt2);
    }
}