import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] arr = my_string.split("");
        String[] reverseArr = arr.clone();
        
        for(int[] q : queries) {
            int s = q[0];
            int e = q[1];
            
            for(int i = s, j = e; j >= s; i++, j--) {
                reverseArr[i] = arr[j];
            }
            arr = reverseArr.clone();
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}