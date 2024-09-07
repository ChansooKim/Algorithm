import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArr = s.split("");
       
        int cnt = 0;
        int reverseCnt = 0;
        String txt = "";
        String x = sArr[0]; // a
        List<String> cntList = new ArrayList<>();
        for(int i=0; i<sArr.length; i++) {  // a b r a c a d a b r a
            if(i == sArr.length-1) {
                cntList.add(sArr[i]);
            } else {
                txt += sArr[i]; // txt= br
                
                if(x.equals(sArr[i])) {  // a
                    cnt++;  // cnt=1
                } else {
                    reverseCnt++;   //recnt=1
                }
                if(cnt == reverseCnt) {
                    cntList.add(txt);   // ab, ra, ca
                    txt = "";
                    cnt = 0;
                    reverseCnt = 0;
                    x = sArr[i+1];  
                }
            }
        }
        answer = cntList.size();
        
        return answer;
    }
}