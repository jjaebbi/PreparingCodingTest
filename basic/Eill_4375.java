package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eill_4375 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            
            while((line = br.readLine()) != null){
                Long a = Long.parseLong(line);
                int count = 0;
                Long t = 0L;
                
                while(true){
                    t = (t*10+1)%a; // 111111 과 같은 모든 자리가 1인 숫자 만들기
                    count++;
                    if(t == 0) break; // t==0이면 멈춤
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            System.exit(0); // 프로그램 종료 시 exit code를 0으로 설정
        }     
    }
}
