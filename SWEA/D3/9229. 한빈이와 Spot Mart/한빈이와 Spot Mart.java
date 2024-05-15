import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int N, M, start, end, cur, answer, snack[];
		
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 과자 봉지 갯수
			M = sc.nextInt(); // 무게 합
			
			start = 0;
			end = N-1;
			answer = -1;
			snack = new int[N];
			
			for(int i = 0; i < N; i++) {
				snack[i] = sc.nextInt();
			}
			
			Arrays.sort(snack);
			
			while(start != end) {
				int add = snack[start] + snack[end];
				
				if(add > M) end--;
				else {
					cur = snack[start] + snack[end];
					answer = answer > cur ? answer : cur;
					start++;
				}
			}
			
			System.out.println("#" + tc + " " + answer);
		}
		
		sc.close();
				
	}
}
