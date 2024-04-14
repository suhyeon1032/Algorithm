import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < intStrs.length; i++) {
            int str = Integer.parseInt(intStrs[i].substring(s, s + l));
            if(k < str) {
                arr.add(str);
            }
        }

        return arr;
    }
}