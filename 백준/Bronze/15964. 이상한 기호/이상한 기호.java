import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(funcAandB(sc.nextLong(), sc.nextLong()));
    }

    static long funcAandB(long A, long B) {
        return (A+B)*(A-B);
    }
}