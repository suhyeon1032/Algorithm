import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			System.out.println("#" + tc + " " + testCase(N));
		}
		
	}

	private static long testCase(int n) {
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		final double avg = Arrays.stream(arr).average().orElse(0);
		return Arrays.stream(arr)
				.filter(num -> num <= avg)
				.count();
	}

}
