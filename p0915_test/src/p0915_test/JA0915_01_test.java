package p0915_test;

import java.util.Scanner;

public class JA0915_01_test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int stuCount = 1;

		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		StuAction stuAction = new StuAction();

		while (true) {
			int choice = stuAction.mainPrint();

			switch (choice) {
			case 1:
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2:
				stuAction.stuOutput();
				break;
			case 3:
				break;

			}// switch

		} // while

	}// main

}// class
