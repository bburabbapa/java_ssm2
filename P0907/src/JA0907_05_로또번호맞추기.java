import java.util.Arrays;
import java.util.Scanner;

public class JA0907_05_로또번호맞추기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 선언
		int[] lotto = new int[45];
		int[] myNo = new int[6];
		int[] winNo = new int[6];
		int temp = 0;
		int count = 0;
		// 로또숫차입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;

		} // for
			// 로또번호섞기
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // for
			// 6개당첨번호추출
		for (int i = 0; i < 6; i++) {
			winNo[i] = lotto[i];
		}
		System.out.println("=====================================");
		System.out.println("-----------로또 500회차-------------- ");
		System.out.println("=====================================");
		// 로또번호직접입력
		for (int i = 0; i < myNo.length; i++) {
			System.out.println("로또번호 입력");
			myNo[i] = scan.nextInt();

		}
		System.out.println();
		System.out.println("=====================================");
		System.out.println("--------------당첨 확인-------------- ");
		System.out.println("=====================================");
		// 번호직접입력
		System.out.print("☆나의 번호: ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(myNo[i]);
				continue;
			}
			System.out.print("," + myNo[i]);

		}
		System.out.println();
		// 직접입력한 번호출력
		System.out.print("★당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(winNo[i]);
				continue;
			}
			System.out.print("," + winNo[i]);

		}
		System.out.println();

//		System.out.println("=====================================");
//		System.out.println("원하는 숫자를 입력하라.");
//		int number = scan.nextInt();
//
//		// 모든 좌표값과 number값을 비교
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if (score[i][j] == number) {
//					score[i][j] = 0;
//					break;
//		Arrays.sort(winNo);

		// 당첨개수출력
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (winNo[i] == myNo[j])
					;// 당첨번호를 나의번호와 하나씩 맞추는 것
				count++;
				break;
			} // for

		} // for
		System.out.println("※당첨개수: " + count);
		System.out.println(Arrays.toString(winNo)); // 배열을 문자열로 변환하는 메서드

	}// main

}// class
