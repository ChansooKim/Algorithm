import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        String S = input[1];
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0; i<N; i++) {
            String[] tmp = sc.nextLine().split(" ");
            String name = tmp[0];
            String chat = tmp[1];
            if(name.equals(S)) {
                res = map.getOrDefault(chat, 0);
                break;
            } else {
                map.put(chat, map.getOrDefault(chat, 0)+1);
            }
        }
        System.out.println(res);
    }
}