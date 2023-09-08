import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class JA0907_08_로또연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 선언
		int[] lotto = new int[45];
		int[] winNo = new int[6];
		int[] myNo = new int[6];
		int[] myWinNo = new int[6];
		int count = 0, temp = 0;

		// Arrays.sort

		// 로또번호입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		// 로또번호섞기
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;

		}
		// 6개당첨번호추출
		for (int i = 0; i < 6; i++) {
			winNo[i] = lotto[i];

		}
		System.out.println("=============로또500회차================");
		System.out.println();
		// 로또번호입력
		for (int i = 0; i < 6; i++) {
			System.out.print("로또번호입력: ");
			myNo[i] = scan.nextInt();

		}
		System.out.println("==============당첨확인===================");
		System.out.println();
		// 나의번호출력
		System.out.print("★나의 번호: ");

		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(myNo[i]);
				continue;
			}
			System.out.print("," + myNo[i]);

		}
		System.out.println();
		// 당첨번호출력
		System.out.print("★당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(winNo[i]);
				continue;
			}
			System.out.print("," + winNo[i]);
		}
		// 당첨개수출력
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (winNo[i] == myNo[i]) {
					myWinNo[count] = winNo[i]; // myWinNo[i]는 불가능함
					count++;
					break;

				}

			}
		}
		System.out.println("당첨개수: " + count);
		System.out.print("맞춘당첨번호: ");
		for (int i = 0; i < count; i++) {
			System.out.printf("%d", myWinNo[i]);
		}
		System.out.println(Arrays.toString(winNo));

	}// main

}// class
