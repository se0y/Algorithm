import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		char[] alpha = new char[26];
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i); 
			
			int askii = (int)c; // 아스키코드로 변환
			if(askii>=97 && askii<=122) {
				askii-=32; // 대문자로 변경하려면, -26이 아니라 -32
			}
			alpha[askii-65]++; // 갯수 세기
		}
		int max = 0;
		int maxNum = 0;
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i] == max) { // 같으면
				maxNum = -1;
			}
			else if(alpha[i] > max) { // 더 크면
				max = alpha[i];
				maxNum = i;
			}
		}
		if(maxNum == -1)
			System.out.print("?");
		else
			System.out.print((char)(maxNum+65));
	}
}