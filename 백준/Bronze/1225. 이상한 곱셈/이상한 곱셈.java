import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        long sum = 0;
        String A = inputs[0];
        String B = inputs[1];
        for(int i=0; i<A.length(); i++) {
            for(int j=0; j<B.length(); j++) {
                int mul = Integer.parseInt(String.valueOf(A.charAt(i)))*Integer.parseInt(String.valueOf(B.charAt(j)));
                sum+=mul;
            }
        }
        System.out.println(sum);
    }
}