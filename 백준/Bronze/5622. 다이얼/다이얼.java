import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int sum = 0;
        for(char tmp : arr) sum += getDialNumber(tmp);
        sum+=arr.length;
        System.out.println(sum);
    }

    static int getDialNumber(char ch) {
        int dial = 0;
        if(65<=ch && ch<=67) dial = 2;
        else if(68<=ch && ch<=70) dial = 3;
        else if(71<=ch && ch<=73) dial = 4;
        else if(74<=ch && ch<=76) dial = 5;
        else if(77<=ch && ch<=79) dial = 6;
        else if(80<=ch && ch<=83) dial = 7;
        else if(84<=ch && ch<=86) dial = 8;
        else if(87<=ch && ch<=90) dial = 9;
        return dial;
    }
}