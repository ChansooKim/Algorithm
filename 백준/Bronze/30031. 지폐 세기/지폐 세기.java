import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        while(N--> 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 136){
                sum += 1000;
            } else if (x == 142) {
                sum += 5000;
            } else if (x == 148) {
                sum += 10000;
            } else if (x == 154)   {
                sum += 50000;
            }
        }
        System.out.println(sum);
    }
}