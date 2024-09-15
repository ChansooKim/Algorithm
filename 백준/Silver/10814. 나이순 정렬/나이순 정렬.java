import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (arr1, arr2)->{
            int age1 = Integer.parseInt(arr1.split(" ")[0]);
            int age2 = Integer.parseInt(arr2.split(" ")[0]);
            return age1 - age2;
        });
        for(String x : arr) System.out.println(x);
        br.close();
    }
}