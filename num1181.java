import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int N;
		N = sc.nextInt();
			
		String st[] = new String[N];
            
            	sc.nextLine();
			
		for(int i=0;i<N;i++) {
			String s = sc.next();
			st[i] = s;
		}
			
		//comparator 개념 공부
		Arrays.sort(st, new Comparator<String>() {
			public int compare(String st1, String st2) {
				//길이가 같으면, 둘 중 사전식 배열 빠른것부터 정렬
				if(st1.length()==st2.length()) {
					return st1.compareTo(st2);
				}else { //길이가 같지 않으면, 길이가 작은 단어부터 정렬
					return st1.length()-st2.length();
				}
			}
		});
			
		System.out.println(st[0]);
			
		for(int i=1;i<N;i++) {
			if(!st[i].equals(st[i-1])) {
				System.out.println(st[i]);
			}
		}
			
		sc.close();	
	}
}
