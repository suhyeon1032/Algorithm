import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            boolean isIndex = false;
            for(int index : indices) {
                if(i == index) {
                    isIndex = true;
                    break;
                } 
            }
            if(!isIndex) answer += my_string.charAt(i);
        }
        return answer;
    }
}