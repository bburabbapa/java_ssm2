import java.util.Scanner;

public class JA0911_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 3개의 숫자를 입력받아 더하기 빼기 곱하기 나누기를 출력해라

//		int a = 10;
//		int b = 5;
//		int c = 0;
//		int  d = 0;
//		int e = 0;

		int[] n = new int[7];
		int result = 0;

		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}

//		System.out.println("첫번째 수 입력: ");
//		a = scan.nextInt();
//
//		System.out.println("두번째 수 입력: ");
//		b = scan.nextInt();
//
//		System.out.println("세번째 수 입력: ");
//		c = scan.nextInt();
//
//		System.out.println("네번째 수 입력: ");
//		d = scan.nextInt();
//		
//		System.out.println("다섯번째 수 입력: ");
//		e = scan.nextInt();

		System.out.print("더하기 결과값: ");
		result = add(n);// int [] n 배열의 주소값을 매개변수로 보냄
		System.out.println(result);

		System.out.print("빼기 결과값: ");
		result = subtract(n);
		System.out.println(result);

		
		System.out.print("곱하기 결과값: ");
		result = multiply(n);
		System.out.println(result);

		System.out.print("나누기 결과값: ");
		result = divide(n);
		System.out.println(result);

	}// main

	static int add(int[] n) { // 객체선언없이 클래스명.메소드명
		int result = n[0];
		for (int i = 0; i < n.length; i++) {
			result += n[i];
		}
		return result;

	}

	static int subtract(int[] n) {
		int result = n[1];
		for (int i = 0; i < n.length; i++) {
			result -= n[i];
		}
		return result;

	}

	static int multiply(int[] n) {
		int result = n[2];
		for (int i = 0; i < n.length; i++) {
			result = result * n[i];
		}
		return result;
	}

	static int divide(int[] n) {
		int result = n[3];
		for (int i = 0; i < n.length; i++) {
			result /= n[i];
		}
		return result;

	}// main

}// class
