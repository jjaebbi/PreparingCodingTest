package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yaksu_17427 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long answer =0l;
        for(int i = 1; i <= t ; i++){
            answer += i*(t/i);
        }
        System.out.println(answer);
    }
}
