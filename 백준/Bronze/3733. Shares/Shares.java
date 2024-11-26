import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder str = new StringBuilder();

        while(true){
            String line = br.readLine();
            if(line == null || line.isEmpty())
                break;

            st = new StringTokenizer(line);

            int N = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            str.append(S/(N+1)).append("\n");
        }

        System.out.print(str);
        br.close();
    }
}