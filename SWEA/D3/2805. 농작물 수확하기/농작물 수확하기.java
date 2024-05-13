import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int sum = 0;
			
			String str = "";
			String[] arr = {};
			
			for(int i = 0; i < N/2; i++) { // 상단
				str = sc.next();
				arr = str.split("");

				for(int j = N/2-i; j <= N/2+i; j++) {
					sum += Integer.parseInt(arr[j]);
				}
			}
			
			for(int i = N/2; i >= 0; i--) { // 하단
				str = sc.next();
				arr = str.split("");
				
				for(int j = N/2-i; j <= N/2+i; j++) {
					sum += Integer.parseInt(arr[j]);
				}
				
			}
			
			System.out.println("#" + tc + " " + sum);
		}
		sc.close();
	}

}
