import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        BigInteger num = new BigInteger("2");

        if(N==1) System.out.println(1);
        else{
            for(int i=0;i<N-1;i++){
                num = num.multiply(new BigInteger("2"));
            }
            num = num.subtract(new BigInteger("1"));
            System.out.println(num);
        }

        if(N<=20){
            hanoi(N, 1,2,3);
        }
    }

    public static void hanoi(int n, int start, int mid, int end){
        if(n==1){
            System.out.println(start+" "+end);
            return;
        }
        else{
            hanoi(n-1, start, end, mid);
            System.out.println(start+ " " + end);
            hanoi(n-1,mid,start, end);
            return;
        }
    }
}
