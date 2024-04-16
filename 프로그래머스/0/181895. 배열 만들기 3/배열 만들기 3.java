import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int[] in : intervals) {
            int a = in[0];
            int b = in[1];
            
            for(int i = a; i <= b; i++) {
                list.add(arr[i]);
            }
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}