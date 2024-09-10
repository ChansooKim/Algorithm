import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        String pos = "0 0";
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                int val = arr[i][j];
                if(Math.max(max, val) == val) {
                    max = val;
                    pos = (i+1)+" "+(j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(pos);
    }
}