import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] splitArr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        String[] answer = {};
        
        for(String s : splitArr) {
            if(!s.isEmpty()) {
                list.add(s);
            }
        }
        
        answer = list.stream().toArray(String[]::new);
        Arrays.sort(answer);
        
        return answer;
    }
}