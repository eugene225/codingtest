import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int ar[][];
    static int cntm = 0;
    static int cnt0 = 0;
    static int cnt1 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ar = new int[N][N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        find(0,0,N);

        System.out.println(cntm);
        System.out.println(cnt0);
        System.out.println(cnt1);
    }

    public static void find(int n, int m, int size){
        if(isEqual(n,m,size)){
            if(ar[n][m]==-1) {
                cntm++;
            }
            else if(ar[n][m]==0) {
                cnt0++;
            }
            else {
                cnt1++;
            }
            return;
        }

        int newsize = size/3;
        //1~9구역으로 구분해 재귀함수 호출
        find(n, m, newsize);  //1구역
        find(n, m+newsize, newsize);  //2구역
        find(n, m + 2*newsize, newsize);  //3구역

        find(n + newsize, m,newsize);  //4구역
        find(n + newsize, m + newsize, newsize);  //5구역
        find(n + newsize, m + 2*newsize, newsize);  //6구역

        find(n + 2*newsize, m, newsize);  //7구역
        find(n + 2*newsize, m + newsize, newsize);  //8구역
        find(n + 2*newsize, m + 2*newsize, newsize);  //9구역

    }

    public static boolean isEqual(int n, int m, int size){
        int num = ar[n][m];
        for(int i=n;i<n+size;i++){
            for(int j=m;j<m+size;j++){
                if(ar[i][j]!=num) return false;
            }
        }
        return true;
    }

}
