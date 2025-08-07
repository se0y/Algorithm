import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // 과목 개수
		double[] score = new double[N]; // 실제 점수들
		double total = 0;
		
		for(int i=0; i<score.length; i++) {
			score[i] = scanner.nextInt();
		}
		double max = score[0];
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		for(int i=0; i<score.length; i++) {
			score[i] = score[i]/max *100;
			total += score[i];
		}
		System.out.print(total/score.length);
	}
}