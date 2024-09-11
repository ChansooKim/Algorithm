import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        while(!"-1".equals(input = br.readLine())) {
            int n = Integer.parseInt(input);
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for(int i=1; i<n; i++) {
                if(n%i==0) {
                    sum+=i;
                    list.add(i);
                }
            }
            if(sum == n) {
                sb.append(n+" = ");
                for(int i=0; i<list.size(); i++) {
                    sb.append(list.get(i));
                    if(list.size() != i+1) sb.append(" + ");
                    else sb.append("\n");
                }
            } else {
                sb.append(n+" is NOT perfect.\n");
            }
        }
        System.out.println(sb);
    }
}