import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, N; 
		
		T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			System.out.println("#" + tc + " " + testN(N));
		}
		sc.close();
	}

	private static int testN(int n) {
		HashSet<Integer> setArr = new HashSet<>();
		int cnt = 0;
		
		for(int i = 1; setArr.size() < 10; i++) {
			int in = i * n;
			String strN = in + "";
			
			for(int j = 0; j < strN.length(); j++) {
				setArr.add(strN.charAt(j) - '0');
			}
			cnt++;
		}
		
		return cnt * n;
	}
}
