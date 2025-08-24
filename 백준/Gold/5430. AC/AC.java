import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int T = Integer.parseInt(br.readLine());
    for (int i = 0; i < T; i++) {
      // 입력 //////////////////
      String cmd = br.readLine();
      
      int n = Integer.parseInt(br.readLine());
      
      Deque<Integer> queue = new ArrayDeque<>();
      String arr = br.readLine();
      arr = arr.substring(1, arr.length() - 1);
      if(n > 0) {
        String[] arrSplit = arr.split(",");
        for (String s : arrSplit) {
          queue.offer(Integer.parseInt(s.trim()));
        }
      }
      
      ///////////////////////////////////
      // 처리
      char[] cmdArr = cmd.toCharArray();
      boolean isReverse = false;
      boolean isError = false;
      
      for (char c : cmdArr) {
        if (c == 'R') {
          isReverse = !isReverse;
        }

        if (c == 'D') {
          if(queue.isEmpty()) {
            isError = true;
            break;
          }
          if (isReverse) {
            int q = queue.pollLast();
          } else {
            queue.poll();
          }
          
        }
      }
      // 출력 //////////////////
      if (isError) {
        System.out.println("error"); 
      } else {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (!queue.isEmpty()) {
          if (isReverse) {
            sb.append(queue.pollLast());
          } else {
            sb.append(queue.poll());
          }
          if (!queue.isEmpty()) sb.append(",");
        }
        sb.append("]");
        System.out.println(sb); 
      }
      
    }
  }
}
