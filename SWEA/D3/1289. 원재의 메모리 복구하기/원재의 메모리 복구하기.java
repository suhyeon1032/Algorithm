import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		String memory;
		char c;
		int cnt;
		
		for(int tc = 1; tc <= T; tc++) {
			memory = sc.next();
			c = '0';
			cnt = 0;
			for(int i = 0; i < memory.length(); i++) {
				if(c != memory.charAt(i)) {
					c = memory.charAt(i);
					cnt++;
				}
			}
			System.out.println("#" + tc + " " + cnt);
		}
	}
}
