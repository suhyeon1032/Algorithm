import java.util.Scanner;

public class Solution {
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			max = -1;
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				for(int j = i + 1; j < N; j++) {
					int val = arr[i] * arr[j];
					check(val);
				}
			}
			System.out.println("#" + tc + " " + max);
		}
		
		sc.close();
	}

	private static void check(int v) {
		String s = Integer.toString(v);
		boolean flag = true;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) - '0' > (s.charAt(i + 1) - '0')) {
				flag = false;
				break;
			}
		}
		
		if(flag) max = Math.max(max, v);
	}
}
