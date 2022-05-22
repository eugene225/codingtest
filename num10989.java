import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] ar = new int[N];
		
		for(int i=0;i<N;i++) {
			ar[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.parallelSort(ar);
		
		for(int i=0;i<N;i++) {
			sb.append(ar[i]).append("\n");
		}
		
		System.out.println(sb);
	}

}
