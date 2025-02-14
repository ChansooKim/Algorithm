import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> person = new HashMap<>();
        for(int i=0; i<name.length;i++) {
            person.put(name[i], yearning[i]);
        }

        for(int i=0; i<photo.length;i++) {
            for(int j=0; j<photo[i].length;j++) {
                answer[i] += person.getOrDefault(photo[i][j], 0);
            }
        }

        return answer;
    }
}