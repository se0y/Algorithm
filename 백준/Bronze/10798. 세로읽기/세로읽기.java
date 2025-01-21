import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        char[][] arr = new char[5][15];
        int maxLength = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 가로 입력
        for(int i = 0; i < 5 ; i ++) {
            String input = br.readLine();
            maxLength = Math.max(maxLength, input.length());
            for(int j = 0; j < input.length(); j ++) {
                arr[i][j] = input.charAt(j);
            }
        }
        // 세로 출력
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < maxLength; i ++) {
            for(int j = 0; j < 5; j ++) {
                if(arr[j][i] != '\0') { // 기본 데이터 타입인 char는 null을 할당할 수 없음. 초기값으로 '\0'을 가짐.
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb);
    }
}