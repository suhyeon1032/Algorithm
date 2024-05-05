import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int[] apts = new int[N];
			int answer = 0;
			
			for(int i = 0; i < N; i++) {
				apts[i] = sc.nextInt();
			}
			
			for(int i = 2; i < N-2; i++) {
				int[] arr = {apts[i-2], apts[i-1], apts[i+1], apts[i+2]};
				int max = Arrays.stream(arr).max().getAsInt();
				if(apts[i] > max) answer += apts[i] - max; 
			}
			System.out.println("#" + tc + " " + answer);
		}
		sc.close();
	}

}
