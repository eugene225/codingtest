import java.io.*;
import java.util.*;

public class Main {
    static int ar[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ar = new int[N+1];
        ar[0] = ar[1] = 0;

        for(int i=2;i<=N;i++){
            ar[i] = ar[i-1]+1;
            if(i%2==0) ar[i] = Math.min(ar[i],ar[i/2]+1);
            if(i%3==0) ar[i] = Math.min(ar[i],ar[i/3]+1);
        }

        System.out.print(ar[N]);
    }
}
