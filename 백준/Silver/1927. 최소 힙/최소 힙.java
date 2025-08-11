import java.util.*;
import java.io.*;
// Priority Queue 사용하면 자동으로 정렬됨 (최소힙)
public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    
    for (int i = 0; i < N; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 0) {
        // 최상위 노드(배열 첫번째 요소) 출력 & 삭제
        if (queue.isEmpty()) {
          System.out.println("0");
        } else {
          System.out.println(queue.poll());
        }
      } else {
        queue.add(x);
      }
    }
  }
}
