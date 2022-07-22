import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //최소힙
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(q.isEmpty()) System.out.println("0");
                else System.out.println(q.poll());
            }else q.add(num);
        }
    }
}
