import java.util.Arrays;
import java.util.Scanner;

public class JA0906_06_로또만들기 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45]; // 전체번호
		int[] winLotto = new int[6]; // 당첨번호
		int[] myNumber = new int[6]; // 나의 번호

		// 1~45번 번호 입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1~45번 입력
		} // for

		// 번호 섞기
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // for

		// 당첨번호입력
		for (int i = 0; i < 6; i++) {
			winLotto[i] = lotto[i];
		} // for

		// 나의 번호
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호를 입력하세요");
			myNumber[i] = scan.nextInt();
		} // for
		Arrays.sort(myNumber); // 순차 정렬 낮은 수부터 차례로
		Arrays.sort(winLotto);

		// 번호 출력
		System.out.println("======================================");
		System.out.println("           로또 500회차              ");
		System.out.println("======================================");

		// 나의 번호
		System.out.print("☆나의번호☆: ");
		for (int i = 0; i < myNumber.length; i++) {
			if (i == 0) {
				System.out.print(myNumber[i]);
				continue;
			}
			System.out.print("," + myNumber[i]);
		}
		System.out.println();

		System.out.print("★당첨번호★: ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(winLotto[i]);
				continue;
			}
			System.out.print("," + winLotto[i]);

		} // for
		System.out.println();

	}// main

}// class
