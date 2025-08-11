import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int N = Integer.parseInt(input[0]);
    int M = Integer.parseInt(input[1]);

    HashMap<String, String> dic = new HashMap<String, String>();
    for (int i = 0; i < N; i++) {
      // (첫글자가 대문자) or (마지막글자가 대문자)인 영어 단어 인풋
      String name = br.readLine();
      dic.put(name, String.valueOf(i+1));
      dic.put(String.valueOf(i+1), name);
    }

    for (int j = 0; j < M; j++) {
      // 알파벳 => 숫자, 숫자 => 알파벳
      String cmd = br.readLine();
      System.out.println(dic.get(cmd));
    }
    
  }
}
