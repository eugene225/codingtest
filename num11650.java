import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class jum{
	int x;
	int y;
	
	public jum(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x+" "+y+"\n";
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		
		jum[] ar = new jum[N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			ar[i] = new jum(x,y);
		}
		
		Arrays.sort(ar, new Comparator<jum>() {
			public int compare(jum j1, jum j2) {
				if(j1.x==j2.x) {
					return j1.y-j2.y;
				}else {
					return j1.x-j2.x;
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			sb.append(ar[i]);
		}
		
		System.out.println(sb);
	}
}
