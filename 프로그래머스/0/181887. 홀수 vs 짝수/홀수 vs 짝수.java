class Solution {
    public int solution(int[] num_list) {
        int arr1 = 0;
        int arr2 = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0 ) arr1 += num_list[i];
            else arr2 += num_list[i];
        }

        arr1 = Math.max(arr1, arr2);
        
        return arr1;
    }
}