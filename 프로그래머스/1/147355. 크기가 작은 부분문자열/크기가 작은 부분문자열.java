import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLength = p.length();
        int tLength = t.length();
        
        // 3 , 7
        // 2, 5
        List<String> sepList = new ArrayList<>();
        for(int i=0; i<tLength-pLength+1;i++) {
            // 0,2  1,3  2,4  3,5
            sepList.add(t.substring(i, i+pLength));  // 314 141 415 159 592
            // 10 02 20 03
        }
        // 7-3+1
        // 5-2+1
        
        Long pNum = Long.parseLong(p);
        for(String str : sepList) {            
            Long strNum = Long.parseLong(str);
            if(pNum >= strNum) {
                answer++;
            }
        }

        return answer;
    }
}