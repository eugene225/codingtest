import java.io.*;
import java.util.*;

public class Main {

    static int ar[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ar = new int[1001];
        ar[1] = 1;
        ar[2] = 2;
        for(int i=3;i<N+1;i++){
            ar[i] = (ar[i-1] + ar[i-2]) % 10007;
        }
        System.out.println(ar[N]);
    }
}
