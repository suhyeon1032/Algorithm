import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        
        for(int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
        }
        int sum = (int)Math.pow((Arrays.stream(num_list).sum()), 2);
        answer = sum < mul ? 0 : 1;
        
        return answer;
    }
}