class Solution {
    public int solution(int n, String control) {
        int answer = n;
        int i = 0;
        
        while(i < control.length()) {
            switch(control.charAt(i)) {
                case 'w':
                    answer++;
                    break;
                case 's':
                    answer--;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;
            }
            i++;
        }
        
        return answer;
    }
}