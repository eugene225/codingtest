import java.io.*;
import java.util.*;

public class Main {

    static long ar[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ar = new long[1001];
        ar[1] = 1;
        ar[2] = 3;
        for(int i=3;i<N+1;i++){
            ar[i] = (ar[i-1] + 2*ar[i-2]) % 10007;
        }
        System.out.println(ar[N]);
    }
}
