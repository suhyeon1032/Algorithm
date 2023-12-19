package Difficulty_2;

import java.util.Scanner;

public class SWEA_1976_시각덧셈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T, startH, startM, addH, addM, H, M;
		
		T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			startH = sc.nextInt();
			startM = sc.nextInt();
			addH = sc.nextInt();
			addM = sc.nextInt();
			
			H = startH + addH;
			M = startM + addM;
			if(60 <= M) {H++; M -= 60;}
			if(0 < H/12) H -= 12;
			System.out.println("#" + tc + " " + H + " " + M);
		}
		sc.close();
	}

}
