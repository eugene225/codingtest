import java.util.Scanner;

public class Main {
		static char chess[][];
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int M = sc.nextInt();
			chess = new char[N][M];
			sc.nextLine();
			
			for (int i = 0; i < N; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < M; j++) {
					chess[i][j] = s.charAt(j);
				}
			}
			
			int min = 1000000;

			for (int i = 0; i < N-7; i++) {
				for (int j = 0; j < M-7; j++) {
					ans = Math.min(min, f(i,j));
				}
			}
			System.out.println(min);
		}
		
		public static int f(int x, int y) {
			int B = 0; 
			int W = 0; 
			
			for (int i = x; i < x+8; i++) {
				for (int j = y; j < y+8; j++) {
					if((i + j) % 2 == 0) {
						if(chess[i][j] == 'B') W++;
						else B++;
					}else { 
						if(chess[i][j] == 'W') W++;
						else B++;
					}
				}
			}
			return Math.min(B,W);
		}
}
