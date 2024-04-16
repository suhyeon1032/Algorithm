import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr) list.add(a);
        
        for(int i = 0; i < query.length; i++) {
            if((i % 2) == 0) {
                for(int j = query[i]+1; j < list.size();) {
                    list.remove(j);
                }
            } else {
                for(int j = query[i]-1; j >= 0; j--) {
                    list.remove(j);
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}