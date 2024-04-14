import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = k; i <= n; i += k) {
            list.add(i);
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}