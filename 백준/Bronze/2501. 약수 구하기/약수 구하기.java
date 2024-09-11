import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i==0) {    // i는 약수
                list.add(i);
            }
        }
        if(list.size() >= k) System.out.println(list.get(k-1));
        else System.out.println(0);
    }
}