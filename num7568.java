import java.util.Scanner;

public class num2475 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int ar[][] = new int[N][2];
			
			for(int i=0;i<N;i++) {
				ar[i][0] = sc.nextInt();
				ar[i][1] = sc.nextInt();
			}
			
			int num[] = new int[N];
			for(int i=0;i<N;i++) {
				int cnt=0;
				for(int j=0;j<N;j++) {
					if(i!=j) {
						if(ar[i][0]<ar[j][0] && ar[i][1]<ar[j][1]) {
							cnt++;
						}
					}
				}
				num[i] = cnt+1;
			}
			
			for(int i=0;i<N;i++) {
				System.out.print(num[i]+" ");
			}
			
			sc.close();
		}
}
