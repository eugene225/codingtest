import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int N;
		
		do {
			N = sc1.nextInt();
			if(N==0) break;
			String st = String.valueOf(N);
			
			int n=N;
			int cnt=0;
			while(n>0) {
				n = n/10;
				cnt++;
			}
			
			int flag=0;
			if(cnt%2==0) {
				for(int i=1;i<=cnt/2;i++) {
					if(st.charAt(i-1) != st.charAt(cnt-i)) {
						flag=1;
						break;
					}
				}
			}else {
				for(int i=1;i<=(cnt-1)/2;i++) {
					if(st.charAt(i-1) != st.charAt(cnt-i)) {
						flag=1;
						break;
					}
				}
			}
			
			if(flag==0) System.out.println("yes");
			else System.out.println("no");
			
		}while(N!=0);
		
		sc1.close();
	}
}
