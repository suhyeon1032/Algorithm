package Difficulty_1;

import java.util.Scanner;

public class SWEA_1933_간단한N의약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		try {
			for(int i = 1; i <= N; i++) {
				if(N % i == 0) System.out.print(i + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
