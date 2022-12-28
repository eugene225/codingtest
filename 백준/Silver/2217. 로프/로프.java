import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer [] ar = new Integer[N];

        for(int i=0;i<N;i++){
            ar[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ar, Comparator.reverseOrder());

        int []cnt = new int[N];
        for(int i=N-1;i>=0;i--){
            cnt[i] = ar[i]*(i+1);
        }
        Arrays.sort(cnt);

        System.out.println(cnt[N-1]);
    }
}
