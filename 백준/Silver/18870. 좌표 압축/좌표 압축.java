import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ar1 = new int[N];
        int[] ar2 = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            ar1[i] = ar2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ar2);
        int cnt=0;
        for(int i=0;i<N;i++){
            if(!map.containsKey(ar2[i])){
                map.put(ar2[i], cnt);
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(map.get(ar1[i])+" ");
        }
        System.out.println(sb);
    }
}