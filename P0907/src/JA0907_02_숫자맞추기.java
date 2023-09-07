import java.util.Scanner;

public class JA0907_02_숫자맞추기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// score[5][5] 1~25까지의 숫자를 입력해서 2차원 형태로 출력
		int[] temp = new int[25];
		int n = 0;
		int[][] score = new int[5][5]; // 좌표값

		// 1차원 배열

		for (int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
		}
		// 번호 섞기
		for (int i = 0; i < 400; i++) {
			int random = (int) (Math.random() * 25);
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;
		}
		// temp 출력
//		for (int i = 0; i < temp.length; i++) {
//			System.out.print(temp[i] + " ");
//		}
//		System.out.println();

		// [5][4] ===== (4*i)+j+1
		// [10][9] ==== (9*i)+j+1
		// 2차원 배열 입력 (temp 입력하기)
		for (int i = 0; i < 5; i++) { // i<5
			for (int j = 0; j < 5; j++) { // i<3
				score[i][j] = (5 * i) + j + 1; // 1부터 25까지
//				score[i][j] = temp[(5*1)+j]; // 1부터 24까지
			}
		}
		// 숫자 맞추기 무한루프
		while (true) {

			// 2차원 출력
			System.out.println();
			System.out.println("           [숫자 맞추기 ]            ");
			System.out.print(" |\t0\t1\t2\t3\t4\n");
			System.out.println("===================================");

			for (int i = 0; i < 5; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				} // for
				System.out.println();

			} // for

			// 숫자를 넣어서 변경
			System.out.println("=====================================");
			System.out.println("원하는 숫자를 입력하라.");
			int number = scan.nextInt();

			// 모든 좌표값과 number값을 비교
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (score[i][j] == number) {
						score[i][j] = 0;
						break;
					}
				}
			}

			// 좌표를 넣어서 해당값을 0으로 변경
//			System.out.println("좌표를 입력하라.(행)");
//			int input1 = scan.nextInt();
//			System.out.println("좌표를 입력하라.(열)");
//			int input2 = scan.nextInt();

			// 좌표 위치값을 0으로 변경
//			score [input1] [input2] = 0;

		} // while

	}// main

}// class
