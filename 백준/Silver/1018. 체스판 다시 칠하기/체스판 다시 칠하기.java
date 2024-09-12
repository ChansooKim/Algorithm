import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        boolean[][] arr = new boolean[n][m];
        for(int i=0; i<n; i++) {
            String line = br.readLine();
            for(int j=0; j<m; j++) {
                if(line.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        int min = getMin(n, m, arr);
        System.out.println(min);
    }

    private static int getMin(int n, int m, boolean[][] arr) {
        int min = 64;
        int x = n -7;
        int y = m -7;
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                int lastN = i+7;
                int lastM = j+7;
                boolean bool = arr[i][j];
                int cnt = 0;
                for(int k=i; k<=lastN; k++) {
                    for(int l=j; l<=lastM; l++) {
                        if(arr[k][l] != bool) {
                            cnt++;
                        }
                        bool = !bool;
                    }
                    bool = !bool;
                }
                cnt = Math.min(cnt, 64-cnt);
                min = Math.min(min, cnt);
            }
        }
        return min;
    }
}