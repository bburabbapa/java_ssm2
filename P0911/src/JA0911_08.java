import java.util.Scanner;

public class JA0911_08 {

	int result; // 자동으로 0을 넣어준다 인스턴스변수 클래스변수는 가능

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;
		JA0911_08 j = new JA0911_08(); // 클래스참조변수 = new 클래스명();
		result = j.addInput();
		System.out.println("결과값: " + result);

	}// main

	int addInput() {
		int result = 0;
		// 입력받고 계산하기
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자입력: ");
		int a = scan.nextInt();
		System.out.println("두번째 숫자입력: ");
		int b = scan.nextInt();
		result = a + b;
		return result;

	}

}// class
