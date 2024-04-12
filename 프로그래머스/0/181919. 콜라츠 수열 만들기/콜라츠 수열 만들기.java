import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        arrList.add(n);
        
        while(n != 1){
            if((n % 2) == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            arrList.add(n);
        }
        
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}