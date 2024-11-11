import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] arr = new char[N][M];
        int row = 0;
        int col = 0;
        for(int i=0; i<arr.length; i++) {
            String input = sc.next();
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        for(int i=0; i<N; i++) {
            boolean flag = true;
            for(int j=0; j<M; j++) {
                if(arr[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag) row++;
        }
        for(int i=0; i<M; i++) {
            boolean flag = true;
            for(int j=0; j<N; j++) {
                if(arr[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if(flag) col++;
        }
        System.out.println(Math.max(row, col));
    }
}