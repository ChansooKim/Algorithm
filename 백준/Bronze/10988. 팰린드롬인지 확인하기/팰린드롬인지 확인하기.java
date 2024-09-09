import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int isPalindrom = 1;
        for(int i=0; i<arr.length/2; i++) {
            if(arr[i] != arr[arr.length-i-1]) {
                isPalindrom = 0;
                break;
            }
        }
        System.out.println(isPalindrom);
    }
}