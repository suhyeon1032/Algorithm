import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			int[][] arrs = new int[100][100];
			int max = 0;
			
			// 입력 받는 코드
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					arrs[i][j] = sc.nextInt();
				}
			}
			
			// 가로, 세로 최대값 구하는 코드
			for(int i = 0; i < 100; i++) {
				int sum1 = 0; int sum2 = 0;
				for(int j = 0; j < 100; j++) {
					sum1 += arrs[i][j];
					sum2 += arrs[j][i];
				}
				max = Math.max(max, Math.max(sum1, sum2));
			}
			
			// 대각선 최대값 
			int sum1 = 0; int sum2 = 0;
			for(int i = 0; i < 100; i++) {
				sum1 += arrs[i][i]; // 왼쪽 위 -> 오른쪽 아래
				sum2 += arrs[i][99-i]; // 오른쪽 위 -> 왼쪽 아래
			}
			
			max = Math.max(max, Math.max(sum1, sum2));
			
			System.out.println("#" + T + " " + max);
			
		}
		sc.close();
	}
}
