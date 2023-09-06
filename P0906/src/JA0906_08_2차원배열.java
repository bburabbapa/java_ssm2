import java.util.Scanner;

public class JA0906_08_2차원배열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subject = { "국어", "영어", "수학" };

		// 2차원 배열
		int[][] score = new int[5][3];

		// 입력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(subject[j] + "점수를 입력하세요.");
				score[i][j] = scan.nextInt();

			} // for
		} // for

		// 출력

		
		System.out.printf("%s\t%s\t%s\n", subject[0], subject[1], subject[2]);
		System.out.println("==================================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "\t");
			} // for
			System.out.println();

		} // for

		// 1차원 배열
//		int[] arrkor = new int[5];
//
//		int[] arrEng = new int[3];
//
//		int[] arrMath = new int[5];
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println("국어점수: ");
//			arrkor[i] = scan.nextInt();
//
//			System.out.println("영어점수: ");
//			arrEng[i] = scan.nextInt();
//
//			System.out.println("수학점수: ");
//			arrMath[i] = scan.nextInt();
//
//		} // for

	}// main

}// class
