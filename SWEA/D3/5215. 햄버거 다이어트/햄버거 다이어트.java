import java.util.Scanner;

public class Solution {
	static int N, L; 
	static int[] score, cal;
	static int answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			
			score = new int[N];
			cal = new int[N];
			answer = 0;
			
			for(int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			
			burger(0, 0, 0);
			
			System.out.println("#" + tc + " " + answer);
			
		}
		sc.close();
	}

	private static void burger(int i, int sumS, int sumC) {
		
		if(sumC > L) return;
		
		if(i == N) { 
			answer = Math.max(sumS, answer);
			return;
		}
		
		burger(i + 1, sumS + score[i], sumC + cal[i]);
		burger(i + 1, sumS, sumC);
	}

}
