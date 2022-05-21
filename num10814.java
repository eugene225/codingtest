import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class member{
	int age;
	String name;
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	
	public void getdata(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return age+" "+name+"\n";
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		member[] ar = new member[N];
		for(int i=0;i<N;i++) {
			ar[i] = new member();
		}
		
		for(int i=0;i<N;i++) {
			int age = sc.nextInt();
			String name = sc.next();
			ar[i].getdata(age, name);
		}
		
		Arrays.sort(ar, new Comparator<member>() {
			public int compare(member m1, member m2) {
				return m1.age-m2.age;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			sb.append(ar[i]);
		}
		
		System.out.println(sb);
		
		sc.close();
	}
}
