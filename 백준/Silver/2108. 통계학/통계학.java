import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
        }
        Arrays.sort(arr);
        sb.append(getAvg(arr)).append("\n");
        sb.append(getMid(arr)).append("\n");
        sb.append(getFreq(arr)).append("\n");
        sb.append(getRange(arr)).append("\n");
        System.out.println(sb);
    }

    static int getAvg(int[] arr) {
        int sum = 0;
        for(int x : arr) sum+=x;
        return (int) Math.round((double) sum / N);
    }

    static int getMid(int[] arr) {
        return arr[N/2];
    }

    static int getFreq(int[] arr) {
        boolean flag = false;
        int mode_max = 0;
        int mode = 10000;
        for(int i=0; i<N; i++) {
            int jump = 0;
            int cnt = 1;
            int val = arr[i];
            for(int j=i+1; j<N; j++) {
                if(val != arr[j]) {
                    break;
                }
                cnt++;
                jump++;
            }
            if (cnt > mode_max) {
                mode_max = cnt;
                mode = val;
                flag = true;
            } else if(cnt == mode_max && flag) {
                mode = val;
                flag = false;
            }
            i+=jump;
        }
        return mode;
    }

    static int getRange(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length-1];
        return max-min;
    }
}