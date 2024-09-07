import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 앞에 같은 글자가 없으면 -1
        // 같은 글자가 있고, 두 칸 앞에 있으면 2(인덱스길이)
        // 같은 글자가 있고 한 칸 앞이면 1
        
        List<String> strList = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            strList.add(String.valueOf(s.charAt(i)));
        }
        // b a n a n a
        String compVar = "";    // 비교변수
        
        Map<Integer, String> compMap = new HashMap<>();
        for(int i = 0; i < strList.size(); i++) {
            // chrStr "a"
            if(i == 0) {
                answer[0] = -1;
                compMap.put(i, strList.get(i));        // { "인덱스" : "철자" }
            } else {
                // compMap = 0: b / 
                String alpha = strList.get(i);  // a
                int count = 0;
                List<Integer> indexList = new ArrayList<>();
                for(int j = 0; j < compMap.size(); j++) {
                    String preAlpha = compMap.get(j);
                    if(alpha.equals(preAlpha)) {
                        indexList.add(j);       // 같은 경우
                        count++;
                    } else {
                        answer[i] = -1;
                    }
                    // i = 3 , compMap = b a n , indexList= { 2 }
                }
                if(count >= 1) {
                    int idx = indexList.get(indexList.size()-1);    // 인덱스 마지막 값
                    answer[i] = i - idx;
                } else {
                    answer[i] = -1;
                }
                
                compMap.put(i, strList.get(i));
            }
        }
        
        
        return answer;
    }
}