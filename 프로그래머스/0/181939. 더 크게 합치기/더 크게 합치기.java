class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int answer_ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer_ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(answer_ab < answer_ba){
            answer = answer_ba;
        } else if(answer_ba < answer_ab){
            answer = answer_ab;
        } else answer = answer_ab;
        
        return answer;
    }
}
