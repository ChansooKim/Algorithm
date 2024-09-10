import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String n = sc.next();
        long b = sc.nextLong();
        long sum = 0;
        int len = n.length();
        long tmp = 1;
        for(int i=len-1; i>=0; i--) {   // 첫째자리수(배열의 맨 뒤) 부터 시작
            char c = n.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                sum += (c-55)*tmp;     // 알파벳인 경우
            } else {
                sum += (c-48)*tmp;     // 알파벳이 아닌 경우
            }
            tmp *= b;           // 앞의 연산 후 진법을 곱해줌
        }
        System.out.println(sum);
    }
}