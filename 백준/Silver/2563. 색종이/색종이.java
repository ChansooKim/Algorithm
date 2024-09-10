import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] paper = new boolean[100][100];
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int a=x; a<x+10; a++) {
                for(int b=y; b<y+10; b++) {
                    paper[a][b] = true;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(paper[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}