import java.io.*;
import java.util.*;

public class Main {

    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;

        for(int i=4;i<=100;i++){
            dp[i] = dp[i-2] + dp[i-3];
        }

        int T = Integer.parseInt(br.readLine());  //테스트 케이스 수

        for(int i=0;i<T;i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N]);
        }
    }
}
