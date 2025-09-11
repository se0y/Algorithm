import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 바구니 개수 // 1<= N <=100
		int M = scanner.nextInt(); // 공 몇 번 바꿀지 //1<= M <=100
		int[] arr = new int[N];
		for(int a=0; a<N; a++) { // 바구니에 공 넣기
			arr[a] = a+1;
		}
		for(int a=0; a<M; a++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt(); // i와 j바구니의 공을 교환
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		for(int a=0; a<N; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}