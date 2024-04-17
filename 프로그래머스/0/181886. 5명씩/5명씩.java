class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5];
        for(int i = 0, j = 0; i < answer.length; i++, j += 5) {
            answer[i] = names[j];
        }
        return answer;
    }
}