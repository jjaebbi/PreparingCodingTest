import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class No_pesticide {
    //방향 검색
    static int[] dr = new int[] {-1, 0, 1, 0}; // 행 위치
    static int[] dc = new int[] {0, 1, 0, -1}; // 열 위치
    static int[][] arr;
    static int m;
    static int n;

    static void dfs(int i, int j){
        arr[i][j]=2;    //방문한 곳 2로 변경

        for(int d=0; d<4; d++){
            int ni = i + dr[d];
            int nj = j + dc[d];
            if(ni>=0 && ni<n && nj>=0 && nj<m && arr[ni][nj]==1){
                dfs(ni, nj);      // 4방향중 1인 곳 검색 후 재귀적으로 dfs 호출
            }
        }
    }

// static int num_required_worm(int n , int m){
//     int answer = 0;
//     for (int i = 0; i <n;i++){
//         for(int j=0;j<m;j++){
//             if (arr[i][j] == 1){
//                 dfs(i,j);
//                 answer+=1;
//             }
//         }
//     }
//     return answer;
// }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n][m];
            int k = Integer.parseInt(st.nextToken());
            while(k-- > 0) {
                st = new StringTokenizer(br.readLine());
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                if (r >= 0 && r < m && c >= 0 && c < n) {
                    arr[c][r] = 1;
                }
            }
            int answer = 0;
            for (int i = 0; i <n;i++){
                for(int j=0;j<m;j++){
                    if (arr[i][j] == 1){
                        dfs(i,j);
                        answer+=1;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}