import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] ar;
    static boolean[] visit;
    static int N,M,V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());  //정점의 수
        M = Integer.parseInt(st.nextToken());  //간선의 수
        V = Integer.parseInt(st.nextToken());  //시작 정점

        ar = new int[N][N];
        visit = new boolean[N];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            ar[a-1][b-1] = 1;
            ar[b-1][a-1] = 1;
        }

        //dfs탐색
        dfs(V-1);
        System.out.println();
        //bfs탐색
        visit = new boolean[N];
        bfs(V-1);

    }

    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i+1+" ");

        for(int n=0;n<N;n++){
            if(ar[i][n]==1 && !visit[n]) dfs(n);
        }
    }

    public static void bfs(int i){
        Queue<Integer> q= new LinkedList<>();
        q.offer(i);
        visit[i] = true;

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp+1+" ");

            for(int k=0; k<N; k++){
                if(ar[temp][k]==1 && !visit[k]){
                    q.offer(k);
                    visit[k] = true;
                }
            }
        }
    }

}
