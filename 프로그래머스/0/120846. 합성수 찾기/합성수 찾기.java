class Solution {
    public int solution(int n) {
        int answer = 0;
		
		for(int i = 4; i <= n; i++) {
			int cnt = 0;
			int sqrt = (int) Math.sqrt(i);
			
			for(int j = 1; j <= sqrt; j++) {
				if(i % j == 0) {
					cnt++;
					if(i / j != j) cnt++;
				}
				
			}
			if(cnt > 2) answer++;
		}
		
		return answer;
    }
}