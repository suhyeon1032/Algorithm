class Solution {
    public int solution(int n) {
        int answer = 0;
		
		for(int i = 1; n / i >= 1; i++) {
			n /= i;
			answer = i;
		}
		
		return answer;
    }
}