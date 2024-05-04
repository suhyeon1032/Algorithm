import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt();
			
			System.out.println("#" + tc + " " + testCase(P));
			
		}
		
	}

	private static int testCase(int p) {
		int[] arrs = new int[p];
		
		for(int i = 0; i < p; i++) {
			arrs[i] = sc.nextInt();
		}
		Arrays.sort(arrs);
		return (p == 1) ? (arrs[0] * arrs[0]) : (arrs[0] * arrs[p-1]);
	}

}
