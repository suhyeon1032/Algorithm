import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int[] time;
	static int N, M, K, bungeo, cnt;
	static String answer = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 손님 수
			M = sc.nextInt(); // 붕어빵 생성에 걸리는 시간
			K = sc.nextInt(); // 만들 수 있는 붕어빵 수
			
			time = new int[N];
			bungeo = 0;
			
			for(int i = 0; i < N; i++) {
				time[i] = sc.nextInt();
			}
			Arrays.sort(time);
			
			answer = check(tc);
			
			System.out.println("#" + tc + " " + answer);
		}
		sc.close();
	}

	private static String check(int tc) {
		for(int i = 0; i < time.length; i++) {
			bungeo = (time[i] / M * K); // 손님이 도착하는 시간에 만들어진 붕어빵 갯수
			
			if(bungeo - i - 1 < 0) {
				return "Impossible";
			}
		}
		return "Possible";
	}
}
