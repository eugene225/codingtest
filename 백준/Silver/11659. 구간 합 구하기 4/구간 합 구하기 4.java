import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.*;
import java.util.*;

public class Main {

    static int ar[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ar = new int[N+1];

        st = new StringTokenizer(br.readLine());
        ar[0] = Integer.parseInt(st.nextToken());
        for(int i=1;i<N;i++){
            ar[i] = ar[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int k=0;k<M;k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            if(i==0) System.out.println(ar[j]);
            else System.out.println(ar[j]-ar[i-1]);
        }
    }
}
