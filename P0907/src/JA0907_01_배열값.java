import java.util.Scanner;

public class JA0907_01_배열값 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[10];

		int[][] num = new int[5][3];

		for (int i = 0; i < num.length; i++) { // i<5
			for (int j = 0; j < num[i].length; j++) { // i<3
				num[i][j] = (3 * i) + j + 1;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j]);
				score[i]= i+1;
			}

		}System.out.println();
		
		System.out.println("=================================");

		// 3i+j+1 === 3*0=0 + 0+1/1+1/2+1
		// 0,1,2,3,4 3*1=3 + 3+0+1/3+1+1/3+2+1

		
		// 1차원 배열
		int[] score2 = new int[10];

		for (int i = 0; i < score.length; i++) {
			score[i] = i + 1;
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
		}

		
	}

}
