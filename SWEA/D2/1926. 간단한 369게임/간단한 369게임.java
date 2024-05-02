import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		String[] arr = new String[T];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(i + 1);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("3") == true || arr[i].contains("6") == true || arr[i].contains("9")) {
			arr[i] = String.valueOf(i + 1).replaceAll("[369]", "-").replaceAll("\\d", "");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}