import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        int[] newArr = Arrays.copyOf(arr, arr.length);
        
        while(!Arrays.equals(arr, test(newArr))) {
            cnt++;
            arr = Arrays.copyOf(newArr, newArr.length);
        }

        return cnt;
    }
    public int[] test(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if((arr[i] >= 50) && arr[i] % 2 == 0) 
                arr[i] = arr[i] / 2;
            else if((arr[i] < 50) && arr[i] % 2 != 0) 
                arr[i] = arr[i] * 2 + 1;
        }
        
        return arr;
    }
}
