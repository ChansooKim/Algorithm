import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       
        Map<String, Integer> playerMap = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for(String calling : callings) {
            
            int grade = playerMap.get(calling);
            
            String forwardPlayer = players[grade-1];
            
            players[grade-1] = calling;
            playerMap.put(calling, grade-1);
            
            players[grade] = forwardPlayer;
            playerMap.put(forwardPlayer, grade);
        }
        
        return players;
    }
}