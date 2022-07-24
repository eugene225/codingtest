import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static int N;  //정점의 수
    static int M;  //간선의 수
    static boolean[] visit;
    static int cnt=0;

    public static void dfs(int start){
        visit[start] = true;
        for (int j = 1; j <= N; j++) {
            if (graph[start][j] == 1 && !visit[j]) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for(int i=1;i<=N;i++){
            if(!visit[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}