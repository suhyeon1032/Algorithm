import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(String s : strArr) {
            if(s.contains("ad") == false) list.add(s);
        }
        
        answer = list.stream().toArray(String[]::new);
        return answer;
    }
}