import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        Integer [] ar = {300, 60, 10};
        int [] cnt = {0, 0, 0};

        while(true){
            if(T%300 == 0){
                cnt[0] += T/300;
                break;
            }
            else if(T >= 300){
                T -= 300;
                cnt[0]++;
            }
            else if(T >= 60){
                T -= 60;
                cnt[1]++;
            }
            else if(T >= 10){
                T -= 10;
                cnt[2]++;
            }
            else{
                cnt[0] = -1;
                break;
            }
        }

        if(cnt[0]==-1) System.out.println(-1);
        else{
            System.out.println(cnt[0]+" "+cnt[1]+" "+cnt[2]);
        }
    }
}
