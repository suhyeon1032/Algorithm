class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;
        
        if(n == 1) a = 0;
        else if(n == 2) b = num_list.length - 1;
        else if(n == 4) c = slicer[2];
        
        int[] answer = new int[(b - a) / c + 1];
        
        int idx = 0;
        for(int i = a; i <= b; i += c) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}