package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj_1978 {
    static int N = 1000;
    static int[] primeNum = new int[N+1];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        for (int i = 2; i <= N+1; i++) {
            for (int j = i*i; j <= N; j+=i) {
                primeNum[j*i] += i;
            }
        }
    }
}
