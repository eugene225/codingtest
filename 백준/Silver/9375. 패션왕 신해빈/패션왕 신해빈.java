import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());  //테스트 케이스 수

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                st.nextToken();
                String name = st.nextToken();

                if(map.get(name)!=null){
                    map.replace(name, map.get(name) + 1);
                }
                else{
                    map.put(name, 1);
                }
            }

            int sum = 1;
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                sum *= e.getValue()+1;
            }
            System.out.println(sum-1);
        }

    }
}
