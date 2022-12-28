import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int money = 1000-N;
        int cnt=0;

        while(money>0){
            if(money%500==0){
                cnt = money/500;
                break;
            }
            else if(money >= 500){
                money -= 500;
                cnt++;
            }
            else if(money >= 100) {
                money-= 100;
                cnt++;
            }
            else if(money >= 50){
                money -= 50;
                cnt++;
            }
            else if(money >= 10){
                money -= 10;
                cnt++;
            }
            else if(money >= 5){
                money -= 5;
                cnt++;
            }
            else {
                money-=1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
