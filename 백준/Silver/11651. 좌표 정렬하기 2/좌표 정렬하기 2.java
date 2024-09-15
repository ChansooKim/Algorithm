import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=0; j<2; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }
        Arrays.sort(arr, (arr1, arr2)->{
            if(arr1[1] == arr2[1]) {
                return arr1[0] - arr2[0];
            } else {
                return arr1[1] - arr2[1];
            }
        });
        for(int[] x : arr) System.out.println(x[0]+" "+x[1]);
        br.close();
    }
}