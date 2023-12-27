package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj_1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String line;
        int bCount =0;
        int wCount = 0;
        int answer = 0;
        for(int i=0; i<n ; i++) {
            line = br.readLine();
            char[] bwArray = line.toCharArray();
            System.out.println(bwArray);
            for (int j=0; j<m ; j++) {
                if (bwArray[j]=='B'){
                    bCount++;
                }
                else{
                    wCount++;
                }
            }
            System.out.println(bCount);
            System.out.println(wCount);
        }
        if (bCount < 32){
            answer = 32 - bCount;
        }
        else if(wCount < 32){
            answer = 32 - wCount;
        }
        System.out.println(answer);
    }
}
