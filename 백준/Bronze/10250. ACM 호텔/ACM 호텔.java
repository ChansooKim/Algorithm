import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int cnt = 0;
            boolean flag = false;
            for(int j=1; j<=w; j++) {
                String a = String.valueOf(j);
                if(flag) break;
                for(int k=1; k<=h; k++) {
                    cnt++;
                    if(cnt == n) {
                        String b = String.valueOf(k);
                        if(j<10) {
                            sb.append(b+"0"+a+"\n");
                        } else {
                            sb.append(b+a+"\n");
                        }
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}