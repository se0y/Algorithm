import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[9][9];
        int max = -1;  // 최소값을 -1로 설정하여 확실히 갱신되도록
        int max_X = -1, max_Y = -1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());  // 한 줄 입력 후 공백 기준으로 분할
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_X = i + 1;
                    max_Y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_X + " " + max_Y);
    }
}