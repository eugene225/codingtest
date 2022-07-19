import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static boolean[][] star;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int size = 4*N-3;

        star = new boolean[size][size];
        point(0,0,N);

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(star[i][j]) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void point(int row, int col, int N){
        if(N==0) return;

        int size = 4*N-3;
        int lastRow = row+size-1;
        int lastCol = col+size-1;

        for(int i=0;i<size;i++){
            star[row][col+i] = true;
            star[lastRow][col+i] = true;

            star[row+i][col] = true;
            star[row+i][lastCol] = true;
        }
        point(row+2,col+2,N-1);
    }
}
