import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int solution(String number) {
        
        int[] arr = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray(); 
        int sum = Arrays.stream(arr).sum();
        
        return sum % 9;
    }
}