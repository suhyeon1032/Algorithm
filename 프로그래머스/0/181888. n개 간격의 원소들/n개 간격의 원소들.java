class Solution {
    public int[] solution(int[] num_list, int n) {
        int answerLeng = (num_list.length % n) == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[answerLeng];
        
        for(int i = 0, j = 0; i < answer.length; i++, j += n) {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}