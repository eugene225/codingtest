import java.io.*;
import java.util.*;

public class Main {
    static int ar[];
    static int dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ar = new int[N+1];
        dp = new int[N+1];

        ar[0] = dp[0] = 0;
        for(int i=1;i<N+1;i++){
            ar[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = ar[1];

        if(N>=2) {
            dp[2] = ar[1]+ar[2];
        }

        for(int i=3;i<=N;i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]+ar[i-1]) + ar[i];
        }

        System.out.println(dp[N]);
    }
}
