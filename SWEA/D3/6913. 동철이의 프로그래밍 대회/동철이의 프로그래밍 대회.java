import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 대회 참여자 수
			int M = sc.nextInt(); // 대회 문제 수
			
			int max = 0;
			int cnt = 0;
			
			for(int i = 1; i <= N; i++) {
				int sum = 0;
				for(int j = 0; j < M; j++) {
					sum += sc.nextInt();
				}
				
				if(max < sum) {
					max = sum;
					cnt = 1;
				} else if(max == sum) {
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt + " " + max);
		}
		sc.close();
	}
}
