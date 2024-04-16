class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            } 
        }
        
        if(min > 0 && max < 0) {
            answer = new int[] {-1};
        } else {
            answer = new int[max - min + 1];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = arr[i + min];
            }   
        }
        
        return answer;
    }
}