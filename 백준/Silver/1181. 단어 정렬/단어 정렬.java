import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            int len = s.length();
            if(list.isEmpty()) {
               list.add(s);
               continue;
            }
            if(list.contains(s)) {
                continue;
            }
            int index = getIndex(list, len, s);
            if(index > list.size()-1) {
                list.add(s);
            } else {
                list.add(index, s);
            }
        }
        for(String x : list) {
            System.out.println(x);
        }
    }

    private static int getIndex(List<String> list, int len, String s) {
        int sameCnt = 0;    // 길이가 같고, 사전 순으로 비교 시 뒤로 가야하는 단어
        int minusCnt = 0;   // 길이가 같고, 사전 순으로 비교 시 앞으로 가야하는 단어
        int j;
        for(j=0; j< list.size(); j++) {
            sameCnt = 0;
            String tmp = list.get(j);
            if(tmp.length() == len) {
                for(int k = 0; k< len; k++) {
                    if(tmp.charAt(k) == s.charAt(k)) {
                    } else if(tmp.charAt(k) < s.charAt(k)){
                        sameCnt++;
                        break;
                    } else {
                        minusCnt++;
                        break;
                    }
                }
            } else if(tmp.length() > len) {
                break;
            }
        }
        return j+sameCnt-minusCnt;
    }
}