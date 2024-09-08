import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int add = sc.nextInt();
        if(m+add > 60) {
            h = h + (m+add)/60;
            m = (m+add)%60;
        } else {
            m = m+add;
        }
        if(m>=60) {
            m=m-60;
            h++;
        }
        if(h>=24) h=h-24;
        System.out.println(h+" "+m);
    }
}
