import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0, even = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if((num_list[i] % 2) == 0) {
                odd = odd * 10 + num_list[i];
            } else even = even * 10 + num_list[i];
        }
        
        answer = odd + even;
        return answer;
    }
}