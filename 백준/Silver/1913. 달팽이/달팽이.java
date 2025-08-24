  import java.util.*;
  import java.io.*;
  
  public class Main{
    public static void main(String args[]) throws IOException {
      // 방향성 (델타탐색)
      int[] dx = {0, 1, 0, -1};
      int[] dy = {1, 0, -1, 0};
      
      // n x n 격자를 만듦
      // 1 ~ n**2 숫자를 하나씩 적응
      // 하나의 방향으로 나아가면서 쭉 적는데, 
      // 더이상 적을 수 없으면 방향을 틀고 적는다 => 그리드를 벗어났을 때 or 이미 숫자가 있을 때
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int cmd = Integer.parseInt(br.readLine());
      int[][] grid = new int[n][n];
      // 시작 방향
      int x = 0; int y = 0; int d = 0;
      //
      int ansRow = -1, ansCol = -1;
  
      for (int i = n*n; i >= 1; i--) {
        grid[x][y] = i;
        if (i == cmd) {
          ansRow = y + 1;
          ansCol = x + 1; 
        }
        
        // 다음 숫자를 위해 x, y 이동
        // 갈 수 있는지 없는지 체크하는 후보군
        int nx = x + dx[d]; 
        int ny = y + dy[d];
        // grid 밖을 벗어났는지 확인
        if (0 > nx || n <= nx || 0 > ny || n <= ny || grid[nx][ny] != 0) {
          d = (d + 1) % 4;
          nx = x + dx[d];
          ny = y + dy[d];
        }
        // 이동에 대한 확정
        x = nx;
        y = ny;
      }
      
      StringBuilder sb = new StringBuilder();
      for (int py = 0; py < n; py++) {
      for (int px = 0; px < n; px++) {
        if (px > 0) sb.append(' ');
        sb.append(grid[px][py]);
      }
      sb.append('\n');
    }

    sb.append(ansRow).append(' ').append(ansCol).append('\n');
    System.out.print(sb.toString());
      
      // System.out.println(Arrays.deepToString(grid));
    }
  }
