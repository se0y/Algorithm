import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(st.nextToken());
                queue.add(new int[]{p, i});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                boolean hasHigher = false;

                for (int[] q : queue) {
                    if (q[0] > cur[0]) {
                        hasHigher = true;
                        break;
                    }
                }

                if (hasHigher) {
                    queue.add(cur);
                } else {
                    count++;
                    if (cur[1] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.print(sb);
    }
}
