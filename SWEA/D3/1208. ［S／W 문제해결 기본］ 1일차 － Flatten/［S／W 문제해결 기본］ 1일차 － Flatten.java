import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 1; t <= 10; t++) {
			int dump = sc.nextInt();
			int[] arr = new int[100];
			
			for(int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < dump; i++) {
				Arrays.sort(arr);
				arr[0]++;
				arr[arr.length-1]--;
			}
			
			int answer = Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
			
			System.out.println("#" + t + " " + answer);
		}
		sc.close();
	}

}
