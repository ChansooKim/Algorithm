import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            if("all".equals(method)) {
                list.clear();
                for(int j=1; j<=20; j++) list.add(String.valueOf(j));
                continue;
            } else if("empty".equals(method)) {
                list.clear();
                continue;
            }
            String x = st.nextToken();
            if("add".equals(method) && !list.contains(x)) {
                list.add(x);
            } else if("remove".equals(method)) {
                list.remove(x);
            } else if("check".equals(method)) {
                if(list.contains(x)) sb.append(1);
                else sb.append(0);
                sb.append("\n");
            } else if("toggle".equals(method)) {
                if(list.contains(x)) list.remove(x);
                else list.add(x);
            }
        }
        System.out.println(sb);
    }
}