class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] q : queries){
            int i = q[0];
            int j = q[1];
            
            int a = arr[i];
            
            arr[i] = arr[j];
            arr[j] = a;
        }
        return arr;
    }
}