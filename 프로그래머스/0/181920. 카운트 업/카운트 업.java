class Solution {
    public int[] solution(int start_num, int end_num) {
        int count = end_num - start_num + 1;
        int[] answer = new int[count];
        for(int i=1; i<=count; i++) {
            answer[i-1] = start_num++;
        }
        
        return answer;
    }
}