import java.util.Scanner;

public class Solution {
	static int T, num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			num = sc.nextInt() + sc.nextInt();
			while(num >= 24) {
				num -= 24;
			}
			System.out.println("#" + tc + " " + num);
		}
		sc.close();
	}

}
