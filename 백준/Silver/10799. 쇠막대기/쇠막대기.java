import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String cmd = br.readLine();

    int openBars = 0; // 막대 카운트
    int result = 0; // 최종 조각
    
    for (int i = 0; i < cmd.length(); i++) {
      char c = cmd.charAt(i);
      // 레이저인지 쇠막대기인지 구분
      if (c == '(') {
        openBars++; // 막대 or 레이저
      } else { // ) 일 경우
        openBars--;
        if (cmd.charAt(i-1) == '(') { // 레이저
          // 열려 있는 막대들 동시에 자름 
          result += openBars;
        } else { // 막대 끝
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
