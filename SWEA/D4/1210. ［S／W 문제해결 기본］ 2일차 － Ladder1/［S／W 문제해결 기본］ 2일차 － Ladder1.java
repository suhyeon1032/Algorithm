import java.util.Scanner;

public class Solution {
	
	static int row, col, answer = 0; // 행, 열, answer
	
	static int[] dr = {0, 0, -1};
    static int[] dc = {-1, 1, 0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			int tc = sc.nextInt();
			
			int[][] arrs = new int[100][100];
			boolean[][] visit = new boolean[100][100];
			
			for(int i = 0; i < 100; i++) { // 배열 입력
				for(int j = 0; j < 100; j++) {
					arrs[i][j] = sc.nextInt();
					if(arrs[i][j] == 2) { // 도착 지점 찾기
						row = i; // 행 값 저장
						col = j; // 열 값 저장
					}
				}
			}
			
			while(true) {
				if(row == 0) break;
				
				boolean flag = false;
				visit[row][col] = true;
				
				for(int i = 0; i < 3; i++) {
					int x = row + dr[i];
					int y = col + dc[i];
					if(x == 0) {
						answer = col;
						flag = true;
						break;
					}
					if(x < 0 || y < 0 || y > 99 || arrs[x][y] == 0 || visit[x][y]) continue;
					row = x;
					col = y;
					break;
				}
				if(flag) break;
			}
			System.out.println("#" + tc + " " + answer);
		}
	}

}
