import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] arr = new int[N+M+1];
			int max = 0;
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					arr[i+j]++;
					max = Math.max(arr[i+j], max);
				}
			}
			
			System.out.print("#" + tc + " ");
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] == max) System.out.print(i + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
