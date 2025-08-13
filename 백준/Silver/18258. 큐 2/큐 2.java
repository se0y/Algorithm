import java.util.*;
import java.io.*;

// 시간 초과 => StringBuilder로 변경
public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    ArrayDeque<Integer> queue = new ArrayDeque<>();

    for (int i = 0; i < N; i++) {
      String[] cmd = br.readLine().split(" ");
      switch(cmd[0]) {
        case "push":
          queue.add(Integer.parseInt(cmd[1]));
          break;
        case "pop":
          if(queue.isEmpty()) {
            sb.append("-1" + "\n");
          } else {
            sb.append(queue.pop() + "\n");
          }
          break;
        case "size":
          sb.append(queue.size() + "\n");
          break;
        case "empty":
          if(queue.isEmpty()) {
            sb.append("1" + "\n");
          } else {
            sb.append("0" + "\n");
          }
          break;
        case "front":
          if(queue.isEmpty()) {
            sb.append("-1" + "\n");
          } else {
            sb.append(queue.peekFirst() + "\n");
          }
          break;
        case "back":
          if(queue.isEmpty()) {
            sb.append("-1" + "\n");
          } else {
            sb.append(queue.peekLast() + "\n");
          }
          break;
      }
    }
    System.out.print(sb);
  }
}
