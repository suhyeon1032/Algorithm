import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 0; tc < 10; tc++) {
			int T = sc.nextInt();
			String s = sc.next();
			String str = sc.next();
			
			int cnt = str.length() - str.replace(s, "").length();
			System.out.println("#" + T + " " + cnt/s.length());
		}
		sc.close();
	}

}
