import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] ar = s.split("-");

        int sum=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i].contains("+")){
                int num = add(ar[i]);
                ar[i] = Integer.toString(num);
            }
            if(i==0) sum=Integer.parseInt(ar[i]);
            else sum-=Integer.parseInt(ar[i]);
        }
        System.out.println(sum);
    }

    public static int add(String s){
        String[] num = s.split("\\+");

        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=Integer.parseInt(num[i]);
        }
        return sum;
    }

}
