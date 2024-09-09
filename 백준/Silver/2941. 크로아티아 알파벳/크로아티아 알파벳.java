import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String[] baseArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0; i<baseArr.length; i++) {
            if(s.contains(baseArr[i])) s = s.replace(baseArr[i], "*");
        }
        System.out.println(s.length());
    }
}