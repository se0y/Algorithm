import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String word = scanner.next(); // 0~99
		
		for(int i=0; i<word.length(); i++) {
			char a = word.charAt(i);
			if(arr[a - 'a'] == -1) {
				arr[a - 'a'] = i;				
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		// charAt() String으로 저장된 문자열 중 한글자를 선택해서 char로 변환
		// split가 배열로 반환하므로 new로 배열 생성할 필요x
		// a 아스키코드 97	
		//for(각 요소 값 : 배열/컨테이너)
	}
}