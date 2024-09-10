import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        char[] arr = new char[36];
        for(int i=0; i<10; i++) {
            arr[i] = (char) (i+48);
        }
        for(int i=10; i<36; i++) {
            arr[i] = (char) (i+55);
        }
        int result;
        StringBuilder answer = new StringBuilder();
        while(n>0) {
            result = n%b;
            n = n/b;
            answer.insert(0, arr[result]);
        }
        System.out.println(answer);
    }
}