import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++) {
            answer[(my_string.charAt(i)) <= 90 ? (my_string.charAt(i)) - 65 : (my_string.charAt(i)) - 71]++;
        }
        return answer;
    }
}