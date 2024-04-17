import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);
        
        int[] answer = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
        
        return answer;
    }
}