import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static int[][] bat;
    static boolean[][] visit;
    static int M,N,K,cnt;
    //상하좌우
    static int x[] = {0,0,-1,1};
    static int y[] = {1,-1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test=0; test<T;test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            bat = new int[M][N];
            visit = new boolean[M][N];

            cnt = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                bat[n][m] = 1;
            }

            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(bat[i][j]==1 && !visit[i][j]){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int i, int j){
        if(i<0||i>=M||j<0||j>=N||bat[i][j]==0 || visit[i][j]) return;
        visit[i][j] = true;
        for(int n=0;n<4;n++){
            dfs(i+x[n],j+y[n]);
        }
    }

}
