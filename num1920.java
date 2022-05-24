import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = null;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] ar1 = new int[N];
		for(int i=0;i<N;i++) {
			int x = Integer.parseInt(st.nextToken());
			ar1[i] = x;
		}
		
		Arrays.sort(ar1);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			if(Arrays.binarySearch(ar1, Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append("\n");
			}
			else {
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
