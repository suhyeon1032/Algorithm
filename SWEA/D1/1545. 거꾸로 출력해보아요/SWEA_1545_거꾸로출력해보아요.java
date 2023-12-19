package Difficulty_1;

import java.util.Scanner;

public class SWEA_1545_거꾸로출력해보아요 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 0; test_case <= T; test_case++)
		{
			System.out.print(T-test_case);
			System.out.print(" ");
		}
	}
}
