import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        int aa = Math.abs(a);
        int bb = Math.abs(b);
        int cmp = Integer.compare(aa, bb);
        if (cmp != 0) return cmp;
        return Integer.compare(a,b);
      }
    });
    
    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) {
        // 값 출력 & 삭제
        sb.append(queue.isEmpty() ? 0 : queue.poll()).append('\n');
      } else {
        // 값 추가
        queue.offer(x);
      }
    }
    System.out.println(sb);
  }
}
