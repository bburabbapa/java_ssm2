import java.util.Scanner;

public class JA0901_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("점수를 입력하세요.");
//		int score = scan.nextInt();
//
//		if (score >= 60) {
//			System.out.println("합격");
//
//		} else {
//			System.out.println("불합격");
//
//		}
//		System.out.println("입력점수: " + score);
//		Scanner scan = new Scanner(System.in);

// 숫자를 입력받아 0보다 크면 0이상인 숫자입니다.
// 0보다 작으면 0이하인 숫자입니다.

//		System.out.println("점수를 입력하세요.");
//		int number = scan.nextInt();
//
//		System.out.println("숫자 " + number);
//
//		if (number >= 0) {
//			System.out.println("0이상인 숫자입니다.");
//
//		} else if (number <= 0) {
//			System.out.println("0이하인 숫자입니다.");
//
//		} else {
//			System.out.println("숫자: " + number);
//		}

// 90점이상은 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, F

		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("D학점");
		}
		System.out.println("점수: " + score);

	}// main

}// class
