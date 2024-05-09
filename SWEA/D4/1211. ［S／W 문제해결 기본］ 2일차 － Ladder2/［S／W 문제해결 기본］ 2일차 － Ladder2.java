import java.util.Scanner;

public class Solution {

	static int row, col, answer = 0; // 행, 열, answer

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();

			int[][] arrs = new int[100][100];
			int min = Integer.MAX_VALUE;
			int idx = 0;

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arrs[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < 100; i++) {
				if(arrs[0][i] == 1) {
					int[][] visit = new int[100][100];
					int x = 0;
					int y = i;
					int cnt = 0;
					while(x < 99) {
						visit[x][y] = 1;
						if(y - 1 >= 0 && visit[x][y - 1] == 0 && arrs[x][y-1] > 0) y--;
						else if(y + 1 < 100 && visit[x][y + 1] == 0 && arrs[x][y + 1] > 0) y++;
						else if(x + 1 < 100 && visit[x + 1][y] == 0 && arrs[x + 1][y] > 0) x++;
						cnt++;
					}
					if(cnt < min) {
						min = cnt;
						idx = i;
					}
				}
			}
			System.out.println("#" + T + " " + idx);
		}
		sc.close();
	}

}
