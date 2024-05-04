import java.util.Scanner;

public class Solution {
	static int T, L, U, X;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			L = sc.nextInt();
			U = sc.nextInt();
			X = sc.nextInt();
			
			System.out.print("#" + tc + " ");
			System.out.println((X < L) ? (L-X) : (X < U) ? 0 : -1);
		}
		
		
		sc.close();
	}

}
