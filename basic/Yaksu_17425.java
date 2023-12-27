package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yaksu_17425 {
    static int N=1000000;
    static long[] divisorSum = new long[N+1];
    static long yaksu_sum[] = new long[N+1];
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; i*j<= N; j ++) {
                divisorSum[j*i] += i;
            }
            yaksu_sum[i] = yaksu_sum[i-1] + divisorSum[i];
        }
        

        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(yaksu_sum[n]).append("\n");
        }
        System.out.println(sb);
    }
}
