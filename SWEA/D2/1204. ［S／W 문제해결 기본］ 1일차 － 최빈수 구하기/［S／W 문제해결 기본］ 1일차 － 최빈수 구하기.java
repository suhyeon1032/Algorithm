import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] scores = new int[101];
			
			for(int i = 0; i < 1000; i++) {
				scores[sc.nextInt()]++; // 점수의 배열 위치에 값 증가 
			}
			

			int max = 0;
			int index = 0;
			
			for(int i = 0; i < scores.length; i++) {
				if(scores[i] >= max) {
					max = scores[i];
					index = i;
				}
			}
			System.out.println("#" + N + " " + index);

		}
		sc.close();
	}

}
