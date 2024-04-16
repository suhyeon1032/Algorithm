class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for(int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        
        return (answer == 0) && (idx != 0) ? -1 : answer;
    }
}