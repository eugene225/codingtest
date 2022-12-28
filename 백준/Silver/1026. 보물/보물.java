import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int [] A = new int[N];
        Integer [] B = new Integer[N];

        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        for(int j=0;j<N;j++){
            A[j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j=0;j<N;j++){
            B[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        int S=0;
        for(int i=0;i<N;i++){
            S += A[i]*B[i];
        }
        System.out.println(S);
    }
}
