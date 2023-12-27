package basic;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.Arrays;
// import java.util.Comparator;
// import java.io.IOException;

// public class Yaksu_1037{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int t = Integer.parseInt(br.readLine());    //약수의 개수
//         String arr[] = br.readLine().split(" ");    //약수 배열로 저장(1이랑 자기자신 제외)
//         Arrays.sort(arr, Comparator.comparingInt(Integer::parseInt));
//         int N= Integer.parseInt(arr[0])*Integer.parseInt(arr[t-1]);
        
//         System.out.println(N);
//     }
// }

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Yaksu_1037{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = 0;
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        N= arr[0]*arr[t-1];
        
        System.out.println(N);
    }
}