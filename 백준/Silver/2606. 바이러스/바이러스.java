import java.io.*;
import java.util.*;

public class Main {
    static int ar[][];
    static boolean tf[];
    static int cnt, N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine()); //점의 개수
        M = Integer.parseInt(br.readLine()); //간선의 수

        ar = new int[N][N];
        tf = new boolean[N];

        for(int i=0;i<M;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            ar[a-1][b-1] = 1;
            ar[b-1][a-1] = 1;
        }

        cnt=0;
        dfs(0);
        System.out.println(cnt-1);

    }

    public static void dfs(int start){
        if(tf[start]) return;

        tf[start] = true;
        cnt++;

        for(int i=0;i<N;i++){
            if(ar[start][i] == 1 && !tf[i]) dfs(i);
        }
    }
}
