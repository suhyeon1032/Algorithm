import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++) {
            String[] nums = String.valueOf(i).split("");
            int cnt = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j].equals("0") || nums[j].equals("5")) {
                    cnt++;
                }
            }
            if(cnt == nums.length) list.add(i);
            
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(list.isEmpty()) answer = new int[] {-1};
        
        return answer;
    }
}