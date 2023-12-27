package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int min_answer = 0;
        int max_answer = 0;
        for(int i = 1; i <= Math.min(num1, num2) ; i++){
            if ((num1 % i == 0) && (num2 % i ==0)){
                min_answer = i;
                max_answer = (num1 / i) * num2;
            }
        }
        System.out.print(min_answer + "\n" + max_answer);
    }
}
