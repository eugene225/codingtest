import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int a,b;
			a = sc.nextInt();
			b = sc.nextInt();
			
			//둘 중 더 작은수를 a로 설정
			if(a>b) {
				int tmp = a;
				a = b;
				b = tmp;
			}
			
			int gcd = 1, lcm = a;
			
			int num = a;
			while(num!=1) {
				if(a%num==0 && b%num==0) {
					gcd = num;
					break;
				}
				num--;
			}
			
			int m,n;
			m = a/gcd;
			n = b/gcd;
			lcm = m*n*gcd;
			
			System.out.println(gcd);
			System.out.println(lcm);
			
			sc.close();
		}
}
