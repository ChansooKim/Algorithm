import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        if("Fizz".equals(c) || "Buzz".equals(c) || "FizzBuzz".equals(c)) {
            if("Fizz".equals(b) || "Buzz".equals(b) || "FizzBuzz".equals(b)) {
                if("Fizz".equals(a) || "Buzz".equals(a) || "FizzBuzz".equals(a)) {
                    System.out.println("Fizz");
                } else {
                    int tmp = Integer.parseInt(a);
                    printFizzBuzz(tmp+3);
                }
            } else {
                int tmp = Integer.parseInt(b);
                printFizzBuzz(tmp+2);
            }
        } else {
            int tmp = Integer.parseInt(c);
            printFizzBuzz(tmp+1);
        }
    }

    private static void printFizzBuzz(int num) {
        if(num %3==0 && num %5==0) {
            System.out.println("FizzBuzz");
        } else if(num %3==0) {
            System.out.println("Fizz");
        } else if(num %5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}