import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] cases = new int[t];
        int[][] dp = new int[41][2];

        dp[0][0] = 1; // n=0일 때 '0'이 출력되는 횟수
        dp[0][1] = 0; // n=0일 때 '1'이 출력되는 횟수
        dp[1][0] = 0; // n=1일 때 '0'이 출력되는 횟수
        dp[1][1] = 1; // n=1일 때 '1'이 출력되는 횟수

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0 ; i < t; i++){
            cases[i] = sc.nextInt();
            System.out.println(dp[cases[i]][0] + " " + dp[cases[i]][1]);
        }
    }
}