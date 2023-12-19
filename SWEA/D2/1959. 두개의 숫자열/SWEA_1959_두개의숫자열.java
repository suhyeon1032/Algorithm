package Difficulty_2;

import java.util.Scanner;

public class SWEA_1959_두개의숫자열 {
static int T, N, M;
static int[] A, B;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			A = new int[N];
			B = new int[M];
			
			for(int i = 0; i < A.length; i++) A[i] = sc.nextInt();
			for(int i = 0; i < B.length; i++) B[i] = sc.nextInt();
			
			if(N>M) System.out.println("#" + tc + " " + test(B, A));
			else if(M>N) System.out.println("#" + tc + " " + test(A, B));
			else System.out.println("#" + tc + " " + test2(A, B));
		}
		sc.close();
	}
	
	private static int test(int[] arr1, int[] arr2) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr2.length-arr1.length+1; i++) {
			int sum = 0;
			for(int j = 0; j < arr1.length; j++) {
				sum += arr1[j] * arr2[i+j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
	private static int test2(int[] arr1, int[] arr2) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += arr1[i] * arr2[i];
		}
		max = Math.max(max, sum);
		return max;
	}
}
