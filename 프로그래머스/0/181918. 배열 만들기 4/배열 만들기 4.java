import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if(arrList.size() == 0) {
                arrList.add(arr[i]);
                i++;
            } else {
                int last = arrList.get(arrList.size() - 1);
                if(arrList.size() != 0 && last < arr[i]) {
                    arrList.add(arr[i]);
                    i++;
                    
                } else if(arrList.size() != 0 && last >= arr[i]) {
                    arrList.remove(arrList.size() - 1);
                }
            }
        }
        int[] stk = arrList.stream().mapToInt(x -> x).toArray();
        
        return stk;
    }
}