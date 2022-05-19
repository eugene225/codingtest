import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class num2475 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//StringBuilder 사용 이유??
			StringBuilder sb = new StringBuilder();
			
			int N = sc.nextInt();
			ArrayList<Integer> ar = new ArrayList<>();
			
			for(int i=0;i<N;i++) {
				ar.add(sc.nextInt());
			}
			
			Collections.sort(ar);
			
			for(int i : ar) {
				sb.append(i).append('\n');
			}
			System.out.println(sb);
			
			sc.close();
		}
}
