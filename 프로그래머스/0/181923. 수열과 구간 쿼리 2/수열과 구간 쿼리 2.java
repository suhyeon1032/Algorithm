import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min = Integer.MAX_VALUE;
            for(int j = s; j <= e; j++) {
                if(k < arr[j]) {
                    min = Math.min(min, arr[j]);
                }
            }
            
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}